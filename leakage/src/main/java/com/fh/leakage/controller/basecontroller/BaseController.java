package com.fh.leakage.controller.basecontroller;

import com.fh.leakage.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinjiahui
 * @create 2021-03-22 18:56
 */
@RestController
@Component
public abstract class BaseController {

    //protected只给子类使用

    @Autowired
    protected ApplicationProgramService applicationProgramService;

    @Autowired
    protected DisableEquipmentService disableEquipmentService;

    @Autowired
    protected EquipmentProgramService equipmentProgramService;

    @Autowired
    protected LeakProofConfigurationService leakProofConfigurationService;

    @Autowired
    protected MonitoringApplicationsService monitoringApplicationsService;

}
