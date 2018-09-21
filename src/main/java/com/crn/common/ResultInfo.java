package com.crn.common;

/**
 * 数据返回
 *
 * @author crn
 * @datetime 2018-09-21 14:10:02
 */
public class ResultInfo {
    private int code;
    private String msg;
    private Object obj;

    public ResultInfo() {
    }

    public ResultInfo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultInfo(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setInfo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setInfo(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }
}
