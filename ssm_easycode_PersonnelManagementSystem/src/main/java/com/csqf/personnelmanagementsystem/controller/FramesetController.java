package com.csqf.personnelmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xu
 * @createTime 2020/3/21
 * @description
 */
@Controller
public class FramesetController {
    @RequestMapping("/all")
    public String goHome(){
        return "frameset/frameset.html";
    }

    @RequestMapping("/left")
    public String left(){
        return "frameset/menu.html";
    }

    @RequestMapping("/right")
    public String right(){
        return "frameset/show.html";
    }

    @RequestMapping("/top")
    public String top(){
        return "frameset/top.jsp";
    }


}
