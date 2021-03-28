package com.fh.leakage.common;

import com.fh.leakage.enums.REnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yinjiahui
 * @create 2021-03-22 20:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {

    private Integer code;//返回的状态码

    private String msg;//返回的提示信息

    private Object data;//返回的数据


    /**
     * 返回的没有参数  只有code和提示信息
     * @param rEnum
     * @return
     */
    public static R result (REnum rEnum){
        return new R(rEnum.getCode(),rEnum.getMsg(),null);
    }

    /**
     * 全都返回
     * @param rEnum
     * @param data
     * @return
     */
    public static R result (REnum rEnum, Object data){
        return new R(rEnum.getCode(),rEnum.getMsg(),data);
    }

    /**
     * 返回错误信息
     * @param msg
     * @return
     */
    public static R error (String msg){

        return new R(1,msg,null);
    }
    /**
     * 返回成功信息
     * @param msg
     * @return
     */
    public static R success (String msg){

        return new R(0,msg,null);
    }

}
