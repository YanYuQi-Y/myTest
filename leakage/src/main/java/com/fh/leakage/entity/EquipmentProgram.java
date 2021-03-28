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
@TableName(value = "equipment_program")
public class EquipmentProgram implements Serializable {
    /**
     * 设备程序id
     */
    @TableId(value = "equipment_program_id", type = IdType.AUTO)
    private Integer equipmentProgramId;

    /**
     * 设备程序name
     */
    @TableField(value = "equipment_program_name")
    private String equipmentProgramName;

    /**
     * 设备程序code
     */
    @TableField(value = "equipment_program_code")
    private Integer equipmentProgramCode;

    private static final long serialVersionUID = 1L;
}