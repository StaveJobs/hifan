package com.sayhi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 小迪
 * @CreateTime 2022/3/18-周五 13:14
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHi() {
        return "Hello, EveryOne.\n Are you ok?";
    }
}
