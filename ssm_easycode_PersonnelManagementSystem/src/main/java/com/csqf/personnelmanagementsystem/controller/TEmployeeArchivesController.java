package com.csqf.personnelmanagementsystem.controller;

import com.csqf.personnelmanagementsystem.entity.TEmployeeArchives;
import com.csqf.personnelmanagementsystem.service.TEmployeeArchivesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 员工档案(TEmployeeArchives)表控制层
 *
 * @author makejava
 * @since 2020-03-21 21:12:49
 */
@RestController
@RequestMapping("tEmployeeArchives")
public class TEmployeeArchivesController {
    /**
     * 服务对象
     */
    @Resource
    private TEmployeeArchivesService tEmployeeArchivesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TEmployeeArchives selectOne(Integer id) {
        return this.tEmployeeArchivesService.queryById(id);
    }

}