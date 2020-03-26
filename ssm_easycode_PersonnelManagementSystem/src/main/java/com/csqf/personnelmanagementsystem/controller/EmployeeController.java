package com.csqf.personnelmanagementsystem.controller;

import com.csqf.personnelmanagementsystem.entity.TEmployeeArchives;
import com.csqf.personnelmanagementsystem.entity.TEmployeeInfomation;
import com.csqf.personnelmanagementsystem.service.TEmployeeInfomationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author Xu
 * @createTime 2020/3/22
 * @description
 */
@Controller
public class EmployeeController {
    @Resource
    private TEmployeeInfomationService employeeInfomationService;
    //    用户档案页面
    @RequestMapping("/myArchive/{fkEid}")
    public String archive(@PathVariable("fkEid") int eid, Model model){
        TEmployeeInfomation myEmployeeInfomation = employeeInfomationService.queryById(eid);
        model.addAttribute("showPage","/myArchiveShow");
        System.out.println(eid);
        return "show/myArchives.jsp";
    }

}
