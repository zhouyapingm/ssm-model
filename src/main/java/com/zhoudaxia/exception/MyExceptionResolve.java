package com.zhoudaxia.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionResolve {

    @ExceptionHandler(value = {Exception.class})
    public ModelAndView resolveException(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex",ex);
        mv.setViewName("error");
        return mv;
    }

}
