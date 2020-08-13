package com.iflyteck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interceptor")
public class InterceptorController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor () {
        System.out.println("testInterceptor!!!");
        return "success";
    }
}
