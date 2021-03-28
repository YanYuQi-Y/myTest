package com.fh.leakage.enums;


/**
 * @author yinjiahui
 * @create 2021-03-04 17:17
 */
public enum REnum {

    SUCCESS_INSERT_OR_UPDATE (0,"新增或修改成功") ,
    SUCCESS_UPDATE (0,"修改成功") ,
    SUCCESS_DELETE(0,"删除成功"),
    SUCCESS_MSG(0,"请求成功"),


    ;

    //返回的数值
    private Integer code;

    //返回的信息
    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 类似构造函数的东西
     * @param code
     * @param msg
     */
    REnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
