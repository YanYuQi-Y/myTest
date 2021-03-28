package com.fh.leakage.service;

import com.fh.leakage.entity.ApplicationProgram;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 应用程序
@author yinjiahui
@create 2021-03-22 18:55
*/
public interface ApplicationProgramService {

    /**
     * 新增时查询所有的应用程序
     * @return
     */
    List<ApplicationProgram> queryApplicationProgram();

}
