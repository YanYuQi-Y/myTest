package com.fh.leakage.controller;

import com.fh.leakage.controller.basecontroller.BaseController;
import com.fh.leakage.entity.ApplicationProgram;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yinjiahui
 * @create 2021-03-22 19:17
 */
@RestController
@RequestMapping("applicationProgram")
public class ApplicationProgramController extends BaseController {

    /**
     * 新增时查询所有的应用程序
     * @return
     */
    @RequestMapping("queryApplicationProgram")
    public List<ApplicationProgram> queryApplicationProgram(){
        return this.applicationProgramService.queryApplicationProgram();
    }

}
