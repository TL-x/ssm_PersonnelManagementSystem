package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.Department;

import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/17
 * @description
 */
public interface IDepartmentService {
    /**
     * 根据position外键盘获取部门
     * @param fk_id
     * @return
     */
    Department getDepartmentByid(int fk_id);

    /**
     * 获取所有的部门
     * @return
     */
    List<Department> getAllDepartment();
}
