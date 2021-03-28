package com.fh.leakage.service.impl;

import com.fh.leakage.entity.LeakProofConfiguration;
import com.fh.leakage.mapper.LeakProofConfigurationMapper;
import com.fh.leakage.service.impl.baseserviceimpl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fh.leakage.entity.MonitoringApplications;
import com.fh.leakage.mapper.MonitoringApplicationsMapper;
import com.fh.leakage.service.MonitoringApplicationsService;
/**
@author yinjiahui
@create 2021-03-22 18:55
*/
@Service
public class MonitoringApplicationsServiceImpl extends BaseServiceImpl<MonitoringApplicationsMapper, MonitoringApplications> implements MonitoringApplicationsService{

    @Override
    public void insertMonitoringApplications(MonitoringApplications monitoringApplications) {

//        this.monitoringApplicationsMapper.insert(monitoringApplications);
    }

    @Override
    public void delMonitoringApplications(Integer LeakProofConfigurationId) {
//        this.monitoringApplicationsMapper.deleteById(LeakProofConfigurationId);
    }

    @Override
    public void updateMonitoringApplications(MonitoringApplications monitoringApplications) {

    }
}
