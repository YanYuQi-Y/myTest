package com.fh.leakage.service;

import com.fh.leakage.entity.MonitoringApplications;
import com.baomidou.mybatisplus.extension.service.IService;
/**
 * 监控应用程序
@author yinjiahui
@create 2021-03-22 18:55
*/
public interface MonitoringApplicationsService {

    /**
     * 新增
     * @param monitoringApplications
     */
    void insertMonitoringApplications(MonitoringApplications monitoringApplications);

    /**
     * 删除
     * @param LeakProofConfigurationId
     */
    void delMonitoringApplications(Integer LeakProofConfigurationId);

    /**
     * 修改
     * @param monitoringApplications
     */
    void updateMonitoringApplications(MonitoringApplications monitoringApplications);

}
