package com.yang.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @GetMapping("/home")
    public String home(){
        return "/home.html";
    }

    @GetMapping("/hello")
    public String hello(){
        return "/hello.html";
    }

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "yes";
    }

    @GetMapping("/login")
    public String login(){
        return "/login.html";
    }
}
