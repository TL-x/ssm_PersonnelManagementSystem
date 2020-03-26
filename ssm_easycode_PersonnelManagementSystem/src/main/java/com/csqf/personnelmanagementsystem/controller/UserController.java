package com.csqf.personnelmanagementsystem.controller;

import com.csqf.personnelmanagementsystem.entity.TUserInfomation;
import com.csqf.personnelmanagementsystem.service.TUserInfomationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Xu
 * @createTime 2020/3/21
 * @description
 */
@Controller
public class UserController {

    @Resource
    private TUserInfomationService userService;

    @RequestMapping("signin")
    public String login(TUserInfomation user, HttpSession session, Model model){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        TUserInfomation vUser = userService.verifyUser(user);
        if (null != vUser){
            session.setAttribute("user",vUser);
            model.addAttribute("user",vUser);
            return "redirect:/home";
        }
        return "redirect:/userindex";
    }

    @RequestMapping("home")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("userindex")
    public String goLogin(){
        return "login.html";
    }

    @RequestMapping("/")
    public String pageIndex(){
        return "redirect:/userindex";
    }

    @RequestMapping("/menu")
    public String getMenu(){
        return "/reset/menu.jsp";
    }

    @RequestMapping("/userInfomation")
    public String userInfomation(){
        return "userInfomation.jsp";
    }
}
