package com.csqf.personnelmanagementsystem.controller;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendance;
import com.csqf.personnelmanagementsystem.service.TEmployeeAttendanceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TEmployeeAttendance)表控制层
 *
 * @author makejava
 * @since 2020-03-25 21:29:50
 */
@RestController
@RequestMapping("tEmployeeAttendance")
public class TEmployeeAttendanceController {
    /**
     * 服务对象
     */
    @Resource
    private TEmployeeAttendanceService tEmployeeAttendanceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TEmployeeAttendance selectOne(Integer id) {
        return this.tEmployeeAttendanceService.queryById(id);
    }

}