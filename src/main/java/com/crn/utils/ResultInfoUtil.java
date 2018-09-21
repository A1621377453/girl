package com.crn.utils;

import com.crn.exception.GirlException;
import com.crn.common.ResultInfo;

/**
 * 数据返回工具
 *
 * @author crn
 * @datetime 2018-09-21 14:17:29
 */
public class ResultInfoUtil {

    /**
     * 返回成功
     *
     * @param obj
     * @return
     */
    public static ResultInfo resultSuccess(Object obj) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setInfo(0, "成功", obj);
        return resultInfo;
    }

    /**
     * 返回异常
     *
     * @return
     */
    public static ResultInfo resultError(GirlException ex) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setInfo(ex.getCode(), ex.getMessage());
        return resultInfo;
    }
}
