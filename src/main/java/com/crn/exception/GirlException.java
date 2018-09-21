package com.crn.exception;

/**
 * 自定义异常
 *
 * @author crn
 * @datetime 2018-09-21 15:03:22
 */
public class GirlException extends RuntimeException {

    private int code;

    public GirlException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
