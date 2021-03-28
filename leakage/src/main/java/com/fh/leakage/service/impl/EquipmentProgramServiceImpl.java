package com.fh.leakage.service.impl;

import com.fh.leakage.entity.LeakProofConfiguration;
import com.fh.leakage.mapper.LeakProofConfigurationMapper;
import com.fh.leakage.service.impl.baseserviceimpl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fh.leakage.entity.EquipmentProgram;
import com.fh.leakage.mapper.EquipmentProgramMapper;
import com.fh.leakage.service.EquipmentProgramService;
/**
@author yinjiahui
@create 2021-03-22 18:55
*/
@Service
public class EquipmentProgramServiceImpl extends BaseServiceImpl<EquipmentProgramMapper, EquipmentProgram> implements EquipmentProgramService{

    @Override
    public List<EquipmentProgram> queryEquipmentProgram() {
        return this.equipmentProgramMapper.selectList(null);
    }
}
