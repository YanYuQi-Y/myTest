package com.fh.leakage.vo;

import com.fh.leakage.entity.LeakProofConfiguration;
import lombok.Data;

import java.util.List;

/**
 * @author yinjiahui
 * @create 2021-03-23 12:01
 */
@Data
public class LeakProofConfigurationVO extends LeakProofConfiguration {

    //白名单
    private List<Integer> whiteList;

    //黑名单
    private List<Integer> blackList;

    //已选监控
    private List<Integer> monitoringList;

    //剪贴板
    private List<Integer> clipboardList;

    //打印机监控程序
    private List<Integer> printerList;


    //设备配置
    private List<Integer> equipmentList;

}
