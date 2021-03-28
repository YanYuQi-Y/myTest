package com.fh.leakage.controller;

import com.fh.leakage.controller.basecontroller.BaseController;
import com.fh.leakage.entity.ApplicationProgram;
import com.fh.leakage.entity.EquipmentProgram;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 设备应用程序
 * @author yinjiahui
 * @create 2021-03-22 19:18
 */
@RestController
@RequestMapping("equipmentProgram")
public class EquipmentProgramController extends BaseController {

    /**
     * 新增时查询所有的设备应用程序
     * @return
     */
    @RequestMapping("queryEquipmentProgram")
    public List<EquipmentProgram> queryEquipmentProgram(){
        return this.equipmentProgramService.queryEquipmentProgram();
    }

}
