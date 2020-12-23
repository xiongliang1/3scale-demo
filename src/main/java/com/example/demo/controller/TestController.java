package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/v1")
public class TestController {
    @GetMapping("/tt/{id}")
    public String hello(@PathVariable( value = "id") String id){
        return  "this is a test....my host....######.....我是测试"+ id;
    }


}
