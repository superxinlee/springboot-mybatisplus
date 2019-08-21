package com.superxinlee.springbootmybatisplus.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hw")
@Api(tags = "hello word!")
public class HelloWordController {

    @GetMapping("/demo")
    public String demo(){
        return "hello word!";
    }
}
