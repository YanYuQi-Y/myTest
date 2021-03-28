package com.fh.leakage.service.impl;

import com.fh.leakage.entity.LeakProofConfiguration;
import com.fh.leakage.mapper.LeakProofConfigurationMapper;
import com.fh.leakage.service.impl.baseserviceimpl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fh.leakage.entity.ApplicationProgram;
import com.fh.leakage.mapper.ApplicationProgramMapper;
import com.fh.leakage.service.ApplicationProgramService;
/**
@author yinjiahui
@create 2021-03-22 18:55
*/
@Service
public class ApplicationProgramServiceImpl extends BaseServiceImpl<ApplicationProgramMapper, ApplicationProgram> implements ApplicationProgramService{

    @Override
    public List<ApplicationProgram> queryApplicationProgram() {
        return this.applicationProgramMapper.selectList(null);
    }
}
