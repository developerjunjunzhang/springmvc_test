package com.iflyteck.controller;

import com.iflyteck.domain.Account;
import com.iflyteck.domain.AccountUserList;
import com.iflyteck.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/params")
public class ParamsController {

    /**
     * 简单的参数绑定
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/testParams")
    public String testParams(String username,String password) {
        System.out.println("testParams!!! + " + username + password);
        return "success";
    }

    /**
     * JavaBean参数绑定
     * @param account
     * @return
     */
    @RequestMapping(path = "/saveAccount", method = {RequestMethod.POST})
    public String saveAccount(Account account) {
        System.out.println("saveAccount!!!");
        System.out.println(account);
        return "success";
    }

    /**
     * 集合数据类型封装
     * @param accountUserList
     * @return
     */
    @RequestMapping(path = "/testListMap", method = {RequestMethod.POST})
    public String testListMap(AccountUserList accountUserList) {
        System.out.println("testListMap!!!");
        System.out.println(accountUserList);
        return "success";
    }

    /**
     * 类型转换 String -> Date
     * @param user
     * @return
     */
    @RequestMapping(path = "/testDate")
    public String saveUser (User user) {
        System.out.println("saveUser!!!!");
        System.out.println(user);
        return "success";
    }

    /**
     * 获取Servlet原生的api
     */
    public String testServlet (HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();

        return "success";
    }
}
