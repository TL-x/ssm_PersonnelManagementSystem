package com.csqf.personnelmanagementsys.controller;

import com.csqf.personnelmanagementsys.pojo.User;
import com.csqf.personnelmanagementsys.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
@Controller
public class UserController {
    @Resource
    private IUserService userServiceImpl;

    @RequestMapping("/sign")
    public String login(User user, HttpSession session, Model model){
        User getUser = userServiceImpl.verifyUser(user);

        if (null != getUser){
            session.setAttribute("user",getUser);
            model.addAttribute("user",getUser);
            return "redirect:/all";
        }

        return"redirect:/login.html";
    }
}
