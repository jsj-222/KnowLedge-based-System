package com.my.konwlege.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//返回字符串
@RestController
public class TestController {
    @Value("${test.hello:HE}")
    private String testHello;
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
}
