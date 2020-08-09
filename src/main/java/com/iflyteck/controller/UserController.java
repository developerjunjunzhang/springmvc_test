package com.iflyteck.controller;

import com.iflyteck.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值是String
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString (Model model) {
        System.out.println("testString!!!");
        User user = new User();
        user.setName("哈哈");
        user.setAge(12);
        model.addAttribute("user",user);
        return "success";
    }

    /**
     * 没有返回值是void的情况下，会自动跳转到路径名的jsp上
     * 如果要想跳转到指定的路径就需要使用请求转发或重定向
     * @param request response
     */
    @RequestMapping("/testVoid")
    public void testVoid (HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid!!!");
        // 请求转发
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        // 重定向
        // response.sendRedirect(request.getContextPath() + "/index.jsp");
        // 直接响应 并解决中文乱码
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        response.getWriter().print("你好！");
        return;
    }

    /**
     * 返回ModelAndView对象
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView () {
        System.out.println("testModelAndView!!!");
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setName("哈哈");
        user.setAge(12);
        // 把user存入到modelAndView对象中，也会把user存入到request对象中
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    /**
     * 使用关键字的方式来进行转发或重定向
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect () {
        System.out.println("testForwardOrRedirect!!!");
        // 请求转发
        // return "forward:/WEB-INF/pages/success.jsp";
        // 重定向
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步请求和响应
     * @return
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax (@RequestBody User user) {
        System.out.println("testAjax!!!");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 响应
        user.setName("哈哈");
        user.setAge(59);
        return user;
    }
}
