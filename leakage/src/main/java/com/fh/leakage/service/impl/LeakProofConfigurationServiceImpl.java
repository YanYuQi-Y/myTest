package com.fh.leakage.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fh.leakage.entity.DisableEquipment;
import com.fh.leakage.vo.LeakProofConfigurationVO;
import com.fh.leakage.entity.MonitoringApplications;
import com.fh.leakage.mapper.LeakProofConfigurationMapper;
import com.fh.leakage.service.impl.baseserviceimpl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fh.leakage.entity.LeakProofConfiguration;
import com.fh.leakage.service.LeakProofConfigurationService;
/**
@author yinjiahui
@create 2021-03-22 18:55
*/
@Service
public class LeakProofConfigurationServiceImpl extends BaseServiceImpl<LeakProofConfigurationMapper,LeakProofConfiguration> implements LeakProofConfigurationService{


    /**
     * 分页查询
     * @param limit
     * @param page
     * @return
     */
    @Override
    public List<LeakProofConfiguration> queryLeakProofConfiguration(Integer limit,Integer page) {

        //分页  第一个参数是当前页 第二个参数是每页显示条数
        IPage<LeakProofConfiguration> pageData = new Page<>(limit,page);

        return this.leakProofConfigurationMapper.selectPage(pageData, null).getRecords();
    }

    //白名单类型
    private static final Integer WHITE_LIST = 0;
    //黑名单类型
    private static final Integer BLACK_LIST = 1;
    //已选控制类型
    private static final Integer MONITORING_LIST = 2;
    //剪贴板类型
    private static final Integer CLIPBOARD_LIST = 3;
    //打印机监控类型
    private static final Integer printer_List = 4;

    /**
     * 新增或修改防泄漏配置
     * @param leakProofConfigurationVO
     */
    @Override
    public void insertOrUpdateLeakProofConfiguration(LeakProofConfigurationVO leakProofConfigurationVO) {


        if (leakProofConfigurationVO.getLeakProofConfigurationId() == null)//没有id是新增
        {
            this.leakProofConfigurationMapper.insert(leakProofConfigurationVO);
        }
        else //有id是修改
        {
            this.leakProofConfigurationMapper.updateById(leakProofConfigurationVO);
        }

        //白名单
        insertOrUpdateMonitoringApplicationsByLeakProofConfigurationIdAndMonitoringApplicationsType(leakProofConfigurationVO.getWhiteList(),leakProofConfigurationVO.getLeakProofConfigurationId(),WHITE_LIST);

        //黑名单
        insertOrUpdateMonitoringApplicationsByLeakProofConfigurationIdAndMonitoringApplicationsType(leakProofConfigurationVO.getBlackList(),leakProofConfigurationVO.getLeakProofConfigurationId(),BLACK_LIST);

        //已选监控
        insertOrUpdateMonitoringApplicationsByLeakProofConfigurationIdAndMonitoringApplicationsType(leakProofConfigurationVO.getMonitoringList(),leakProofConfigurationVO.getLeakProofConfigurationId(),MONITORING_LIST);

        //剪贴板
        insertOrUpdateMonitoringApplicationsByLeakProofConfigurationIdAndMonitoringApplicationsType(leakProofConfigurationVO.getClipboardList(),leakProofConfigurationVO.getLeakProofConfigurationId(),CLIPBOARD_LIST);

        //打印机监控
        insertOrUpdateMonitoringApplicationsByLeakProofConfigurationIdAndMonitoringApplicationsType(leakProofConfigurationVO.getPrinterList(),leakProofConfigurationVO.getLeakProofConfigurationId(),printer_List);

        //禁用的设备
        insertOrUpdateDisableEquipmentByLeakProofConfigurationId(leakProofConfigurationVO.getEquipmentList(),leakProofConfigurationVO.getLeakProofConfigurationId());
    }


    /**
     *
     * 因为新增和修改差不多所以我们就进行了合并，在新增的时候也显示给他删除一回在进行新增
     *
     * 修改就是将原先数据删除掉在进行新增新的数据
     *
     * 将id集合、防泄漏配置id、类型id传过来进行新增
     *
     * 这个地方要与前端人员协商好  穿过来的[]这个表示删除  传过来为空null表示不修改这个集合数据
     *
     * @param list
     * @param leakProofConfigurationId
     * @param monitoringApplicationsType
     */
    public void insertOrUpdateMonitoringApplicationsByLeakProofConfigurationIdAndMonitoringApplicationsType(List<Integer> list,Integer leakProofConfigurationId,Integer monitoringApplicationsType){

        //这个地方就是判断集合是为[]还是为null
        if (list != null){//list集合为[]的时候进行删除
            Map<String,Object> map = new HashMap<>();
            map.put("leak_proof_configuration_id",leakProofConfigurationId);
            map.put("monitoring_applications_type",monitoringApplicationsType);
            this.monitoringApplicationsMapper.deleteByMap(map);
        }

        if (list != null && list.size() > 0){

            list.forEach(id->{
                this.monitoringApplicationsMapper.insert( new MonitoringApplications(null,id,leakProofConfigurationId,monitoringApplicationsType));
            });

        }
    }


    /**
     *
     * 禁用的设备
     *
     * @param list
     * @param leakProofConfigurationId
     */
    public void insertOrUpdateDisableEquipmentByLeakProofConfigurationId(List<Integer> list,Integer leakProofConfigurationId){

        if (list != null){//list集合为[]的时候进行删除
            Map<String,Object> map = new HashMap<>();
            map.put("leak_proof_configuration_id",leakProofConfigurationId);
            this.disableEquipmentMapper.deleteByMap(map);
        }

        if (list != null && list.size() > 0){

            list.forEach(id->{
                this.disableEquipmentMapper.insert( new DisableEquipment(null,id,leakProofConfigurationId));
            });

        }
    }



    /**
     * 回显
     * @param LeakProofConfigurationId
     * @return
     */
    @Override
    public LeakProofConfiguration getByLeakProofConfigurationId(Integer LeakProofConfigurationId) {

        return this.leakProofConfigurationMapper.selectById(LeakProofConfigurationId);
    }


}

