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
@TableName(value = "disable_equipment")
public class DisableEquipment implements Serializable {
    /**
     * 禁用设备id
     */
    @TableId(value = "disable_equipment_id", type = IdType.AUTO)
    private Integer disableEquipmentId;

    /**
     * 设备id
     */
    @TableField(value = "equipment_program_id")
    private Integer equipmentProgramId;

    /**
     * 防漏配置id
     */
    @TableField(value = "leak_proof_configuration_id")
    private Integer leakProofConfigurationId;

    private static final long serialVersionUID = 1L;
}