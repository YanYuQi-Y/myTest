package com.fh.leakage.service.impl.baseserviceimpl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fh.leakage.mapper.*;
import org.apache.catalina.manager.util.BaseSessionComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yinjiahui
 * @create 2021-03-22 18:56
 */
@Service
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M,T> {

    @Autowired
    protected ApplicationProgramMapper applicationProgramMapper;

    @Autowired
    protected DisableEquipmentMapper disableEquipmentMapper;

    @Autowired
    protected EquipmentProgramMapper equipmentProgramMapper;

    @Autowired
    protected LeakProofConfigurationMapper leakProofConfigurationMapper;

    @Autowired
    protected MonitoringApplicationsMapper monitoringApplicationsMapper;

}
