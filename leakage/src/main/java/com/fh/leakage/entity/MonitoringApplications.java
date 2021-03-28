package com.fh.leakage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author yinjiahui
@create 2021-03-22 18:55
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "monitoring_applications")
public class MonitoringApplications implements Serializable {
    /**
     * 监控、黑、 白、剪贴板应用程序id
     */
    @TableId(value = "monitoring_applications_id", type = IdType.AUTO)
    private Integer monitoringApplicationsId;

    /**
     * 应用程序id
     */
    @TableField(value = "application_program_id")
    private Integer applicationProgramId;

    /**
     * 防泄漏配置id
     */
    @TableField(value = "leak_proof_configuration_id")
    private Integer leakProofConfigurationId;

    /**
     * 类型(0白名单 1黑名单  2监控列表 3剪贴板)
     */
    @TableField(value = "monitoring_applications_type")
    private Integer monitoringApplicationsType;

    private static final long serialVersionUID = 1L;
}