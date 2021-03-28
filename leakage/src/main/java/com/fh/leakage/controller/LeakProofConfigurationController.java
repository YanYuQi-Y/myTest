package com.fh.leakage.controller;

import com.fh.leakage.vo.LeakProofConfigurationVO;
import com.fh.leakage.common.R;
import com.fh.leakage.controller.basecontroller.BaseController;
import com.fh.leakage.enums.REnum;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinjiahui
 * @create 2021-03-22 19:18
 */
@RestController
@RequestMapping("leakProofConfiguration")
public class LeakProofConfigurationController extends BaseController {

    /**
     * 分页查询
     * @param limit
     * @param page
     * @return
     */
    @RequestMapping("queryLeakProofConfiguration/{limit}/{page}")
    public R queryLeakProofConfiguration(@PathVariable("limit") Integer limit,@PathVariable("page") Integer page){
        return R.result(REnum.SUCCESS_MSG,this.leakProofConfigurationService.queryLeakProofConfiguration(limit,page));
    }

    /**
     * 新增或修改防泄漏配置
     * @param leakProofConfigurationVO
     */
    @RequestMapping("insertOrUpdateLeakProofConfiguration")
    public R insertOrUpdateLeakProofConfiguration(@RequestBody LeakProofConfigurationVO leakProofConfigurationVO) {

        this.leakProofConfigurationService.insertOrUpdateLeakProofConfiguration(leakProofConfigurationVO);

        return R.result(REnum.SUCCESS_INSERT_OR_UPDATE);
    }

    /**
     * 回显
     * @param LeakProofConfigurationId
     * @return
     */
    @RequestMapping("getByLeakProofConfigurationId/{LeakProofConfigurationId}")
    public R getByLeakProofConfigurationId(@PathVariable("LeakProofConfigurationId") Integer LeakProofConfigurationId) {

        return R.result(REnum.SUCCESS_MSG,this.leakProofConfigurationService.getByLeakProofConfigurationId(LeakProofConfigurationId));
    }

}
