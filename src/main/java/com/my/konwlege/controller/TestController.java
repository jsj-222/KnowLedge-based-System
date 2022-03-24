package com.my.konwlege.controller;

import com.my.konwlege.domain.Test;
import com.my.konwlege.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//返回字符串
@RestController
public class TestController {
    @Value("${test.hello:HE}")
    private String testHello;
    @Resource
    private TestService testService;
    //接口
    @GetMapping("/hello")
    public String hello(){
        return "hello World"+testHello;
    }
    //接口
    @PostMapping("/hello/post")
    public String hello(String name){
        return "hello World"+name;
    }

    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }
}
