package com.echo.exception.resolver;

import com.echo.exception.SSMCustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author joians
 * createTime: 2019-08-26 20:04:48
 */
public class SSMCustomExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        SSMCustomException customException = null;
        if (ex instanceof SSMCustomException) {
            customException = (SSMCustomException) ex;
        } else  {
            customException = new SSMCustomException("未知错误！");
        }
        ModelAndView errorMv = new ModelAndView();
        errorMv.addObject("error",customException.getMessage());
        errorMv.setViewName("error");
        return errorMv;
    }
}
