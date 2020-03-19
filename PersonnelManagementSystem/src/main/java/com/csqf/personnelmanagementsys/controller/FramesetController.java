package com.csqf.personnelmanagementsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Xu
 * @createTime 2020/3/19
 * @description
 */
@Controller
public class FramesetController {
    @RequestMapping("/all")
    public String goHome(){
        System.out.println(1111);
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
        return "frameset/top.html";
    }

    @RequestMapping("/address")
    public String addr(){
        return "frameset/address.html";
    }
}
