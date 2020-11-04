package com.ffz.spring_boot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : HelloController.java
 * @Description : //
 * @Author fengfazheng
 * @Date 2020-11-04 11:09
 * @Version : 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,world,how are you?";
    }
}
