package com.iflyteck.controller;

import com.iflyteck.domain.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class TestExceptionController {

    @RequestMapping("/testException")
    public String testException () throws SysException {
        System.out.println("testException!!!");
        try {
            // 模拟异常
            int a = 1/0;
        } catch (Exception e) {
            // 打印异常信息
            e.printStackTrace();
            throw new SysException("查询出现异常");
        }

        return "success";
    }
}
