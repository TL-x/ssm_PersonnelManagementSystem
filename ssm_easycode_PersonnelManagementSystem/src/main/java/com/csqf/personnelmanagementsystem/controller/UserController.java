package com.csqf.personnelmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xu
 * @createTime 2020/3/21
 * @description
 */
@Controller
public class UserController {

    @RequestMapping("signin")
    public String login(){

        return "/restart";
    }


    @RequestMapping("userindex")
    public String goLogin(){
        return "login.html";
    }

    @RequestMapping("/")
    public String pageIndex(){
        return "redirect:/userindex";
    }

}
