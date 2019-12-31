package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mega
 * @Description:
 * @Date： 1:56
 */
@RestController
public class Hello {

    @GetMapping("hello")
    private String Hello() {


        return "hello world";
    }


}
