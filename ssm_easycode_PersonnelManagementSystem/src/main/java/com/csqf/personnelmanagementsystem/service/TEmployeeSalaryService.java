package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeSalary;
import java.util.List;

/**
 * (TEmployeeSalary)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:34:33
 */
public interface TEmployeeSalaryService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEsid 主键
     * @return 实例对象
     */
    TEmployeeSalary queryById(Integer pkEsid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeSalary> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeSalary 实例对象
     * @return 实例对象
     */
    TEmployeeSalary insert(TEmployeeSalary tEmployeeSalary);

    /**
     * 修改数据
     *
     * @param tEmployeeSalary 实例对象
     * @return 实例对象
     */
    TEmployeeSalary update(TEmployeeSalary tEmployeeSalary);

    /**
     * 通过主键删除数据
     *
     * @param pkEsid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkEsid);

}