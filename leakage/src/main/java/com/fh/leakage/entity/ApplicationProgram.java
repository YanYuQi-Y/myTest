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
@TableName(value = "application_program")
public class ApplicationProgram implements Serializable {
    /**
     * 应用程序id
     */
    @TableId(value = "application_program_id", type = IdType.AUTO)
    private Integer applicationProgramId;

    /**
     * 应用程序name
     */
    @TableField(value = "application_program_name")
    private String applicationProgramName;

    /**
     * 应用程序code
     */
    @TableField(value = "application_program_code")
    private Integer applicationProgramCode;

    private static final long serialVersionUID = 1L;
}