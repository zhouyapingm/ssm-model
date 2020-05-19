package com.zhoudaxia.controller;

import com.zhoudaxia.bean.Test;
import com.zhoudaxia.service.TestService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("insertTest")
    public String insertTest(Test test){
        System.out.println("test = " + test);
        int i =testService.insertTest(test);
        return "success";
    }

}
