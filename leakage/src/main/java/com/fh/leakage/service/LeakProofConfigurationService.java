package com.fh.leakage.service;

import com.fh.leakage.vo.LeakProofConfigurationVO;
import com.fh.leakage.entity.LeakProofConfiguration;

import java.util.List;

/**
 * 防泄漏配置
@author yinjiahui
@create 2021-03-22 18:55
*/
public interface LeakProofConfigurationService {

    /**
     * 分页查询
     * @param limit
     * @param page
     * @return
     */
    List<LeakProofConfiguration> queryLeakProofConfiguration(Integer limit, Integer page);

    /**
     * 新增或修改防泄漏配置
     * @param leakProofConfigurationVO
     */
    void insertOrUpdateLeakProofConfiguration(LeakProofConfigurationVO leakProofConfigurationVO);

    /**
     * 回显
     * @param LeakProofConfigurationId
     * @return
     */
    LeakProofConfiguration getByLeakProofConfigurationId(Integer LeakProofConfigurationId);

}
