package com.iflyteck.controller;

import com.iflyteck.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //  把msg中的信息存入到session域中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam (@RequestParam(name = "name") String username) {
        System.out.println("testRequestParam!!!");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody (@RequestBody String body) {
        System.out.println("testRequestBody!!!");
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable (@PathVariable(name = "sid") String id) {
        System.out.println("testPathVaribale!!!");
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader (@RequestHeader("Accept") String header) {
        System.out.println("testRequestHeader!!!");
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue (@CookieValue(name = "JSESSIONID") String cookieValue) {
        System.out.println("testCookieValue!!!");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping("/testModelAttribute1")
    public String testModelAttribute1 (User user) {
        System.out.println("testModelAttribute1!!!");
        System.out.println(user);
        return "success";
    }


    @RequestMapping("/testModelAttribute2")
    public String testModelAttribute2 (@ModelAttribute("abc") User user) {
        System.out.println("testModelAttribute2!!!");
        System.out.println(user);
        return "success";
    }

    /**
     * 没有返回值的ModelAttribute使用
     */
    @ModelAttribute
    public void showUser (String name,Map<String,User> userMap) {
        System.out.println("showUser!!!");
        User user = new User();
        user.setName(name);
        user.setAge(20);
        userMap.put("abc", user);
    }

    /**
     * 有返回值的ModelAttribute使用
     */
//    @ModelAttribute
//    public User showUser (String name) {
//        System.out.println("showUser!!!");
//        User user = new User();
//        user.setName(name);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes (Model model) {
        System.out.println("testSessionAttributes!!!");
        model.addAttribute("msg","美美");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes (ModelMap modelMap) {
        System.out.println("getSessionAttributes!!!");
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes (SessionStatus status) {
        System.out.println("delSessionAttributes!!!");
        status.setComplete();
        return "success";
    }
}
