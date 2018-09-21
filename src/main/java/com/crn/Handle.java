package com.crn;

import com.crn.common.ResultInfo;
import com.crn.exception.GirlException;
import com.crn.utils.ResultInfoUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 *
 * @author crn
 * @datetime 2018-09-21 14:48:06
 */
@ControllerAdvice
public class Handle {

    @ResponseBody
    @ExceptionHandler(value = GirlException.class)
    public ResultInfo errorHandler(GirlException ex) {
        return ResultInfoUtil.resultError(ex);
    }
}
