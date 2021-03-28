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
@TableName(value = "leak_proof_configuration")
public class LeakProofConfiguration implements Serializable {
    /**
     * 防泄漏配置id
     */
    @TableId(value = "leak_proof_configuration_id", type = IdType.AUTO)
    private Integer leakProofConfigurationId;

    /**
     * 防泄漏配置名称
     */
    @TableField(value = "leak_proof_configuration_name")
    private String leakProofConfigurationName;

    /**
     * 防泄漏配置描述
     */
    @TableField(value = "leak_proof_configuration_description")
    private String leakProofConfigurationDescription;

    /**
     * 监控应用 0监控-启用外泄管控策略  1监控-不允许打开敏感文件
     */
    @TableField(value = "monitoring_application")
    private Integer monitoringApplication;

    /**
     * 其他应用程序等级  不监控0  禁止运行1  监控-启用外泄管控策略2  监控-不允许打开敏感文件3
     */
    @TableField(value = "other_application_levels")
    private Integer otherApplicationLevels;

    /**
     * 禁止运行移动介质上的应用程序 0否 1是
     */
    @TableField(value = "disable_applications_on_mobile_media")
    private Integer disableApplicationsOnMobileMedia;

    /**
     * 禁止保存文件至移动设备 0否 1是
     */
    @TableField(value = "disable_saving_files_to_mobile_devices")
    private Integer disableSavingFilesToMobileDevices;

    /**
     * 移动介质监控  0否 1是
     */
    @TableField(value = "mobile_media_monitoring")
    private Integer mobileMediaMonitoring;

    /**
     * 启动剪贴板  0否 1是
     */
    @TableField(value = "start_clipboard")
    private Integer startClipboard;

    /**
     * 启动截屏  0否 1是
     */
    @TableField(value = "start_screen_capture")
    private Integer startScreenCapture;

    /**
     * 监控本地文件到网络路径  0否 1是
     */
    @TableField(value = "monitor_local_file_to_network_path")
    private Integer monitorLocalFileToNetworkPath;

    /**
     * 允许打印机  0否 1是
     */
    @TableField(value = "allow_printers")
    private Integer allowPrinters;

    /**
     * 启动打印机监控  0否 1是
     */
    @TableField(value = "start_printer_monitoring")
    private Integer startPrinterMonitoring;

    /**
     * 启动打印水印  0否 1是
     */
    @TableField(value = "start_printing_watermark")
    private Integer startPrintingWatermark;

    /**
     * 允许卸载客户端  0否 1是
     */
    @TableField(value = "allow_client_to_uninstall")
    private Integer allowClientToUninstall;

    /**
     * 开启图片文字识别  0否 1是
     */
    @TableField(value = "turn_on_picture_character_recognition")
    private Integer turnOnPictureCharacterRecognition;

    /**
     * 超过含xx大小的文件    数字
     */
    @TableField(value = "file_size_exceeded")
    private Integer fileSizeExceeded;

    /**
     * 上传到syslog服务器  0否 1是
     */
    @TableField(value = "upload_to_syslog_server")
    private Integer uploadToSyslogServer;

    private static final long serialVersionUID = 1L;
}