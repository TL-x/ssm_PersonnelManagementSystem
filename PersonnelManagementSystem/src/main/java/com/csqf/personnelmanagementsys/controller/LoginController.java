package com.csqf.personnelmanagementsys.controller;

import com.csqf.personnelmanagementsys.mapper.IUserDao;
import com.csqf.personnelmanagementsys.pojo.User;
import com.csqf.personnelmanagementsys.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Xu
 * @createTime 2020/3/19
 * @description
 */
@Controller
public class LoginController {

    @Resource
    private IUserService userServiceImpl;

    @RequestMapping("/login")
    public String login(User user){
        User getUser = userServiceImpl.getUserByUser(user);
        if (null != getUser){
            return "redirect:/all";
        }
        return"redirect:/fail.html";
    }
}
