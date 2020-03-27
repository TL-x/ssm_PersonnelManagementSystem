package com.csqf.personnelmanagementsystem.controller;

import com.csqf.personnelmanagementsystem.entity.TUserInfomation;
import com.csqf.personnelmanagementsystem.service.TUserInfomationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    @RequestMapping("/signin")
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

    @RequestMapping("/userindex")
    public String goLogin(){
        return "login.html";
    }

    @RequestMapping("/")
    public String pageIndex(){
        return "redirect:/userindex";
    }

    /**
     * 退出登陆
     * @return
     */
    @RequestMapping("/signout")
    public String signout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/userindex";
    }

    /**
     * 返回主页home
     * @return
     */
    @RequestMapping("/home")
    public String home(){
        return "home.jsp";
    }

    /**
     * 修改user
     * @return
     */
    @GetMapping("/modifyUser")
    public String modifyUserPage(){
        System.out.println("执行get");
        return "user/modifyUser.jsp";
    }
    @PostMapping("/modifyUser")
    public String modifyUser(TUserInfomation user, HttpSession session){
        System.out.println("执行post");
        System.out.println(user);
        TUserInfomation update = userService.update(user);
        if (null != update){
            if (null != session.getAttribute("updateUserFail")){
                session.removeAttribute("updateUserFail");
            }
            session.setAttribute("user",update);
            return "redirect:/modifyUser";
        }
        session.setAttribute("updateUserFail","修改失败");
        return "redirect:/modifyUser";
    }

    @GetMapping("/addUser")
    public String addUserPage(){
        return "/user/addUser.jsp";
    }
}
