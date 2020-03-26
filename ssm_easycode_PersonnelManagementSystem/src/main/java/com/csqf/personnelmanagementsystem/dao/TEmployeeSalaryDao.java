package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeSalary;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeSalary)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:34:32
 */
public interface TEmployeeSalaryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEsid 主键
     * @return 实例对象
     */
    TEmployeeSalary queryById(Integer pkEsid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeSalary> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeSalary 实例对象
     * @return 对象列表
     */
    List<TEmployeeSalary> queryAll(TEmployeeSalary tEmployeeSalary);

    /**
     * 新增数据
     *
     * @param tEmployeeSalary 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeSalary tEmployeeSalary);

    /**
     * 修改数据
     *
     * @param tEmployeeSalary 实例对象
     * @return 影响行数
     */
    int update(TEmployeeSalary tEmployeeSalary);

    /**
     * 通过主键删除数据
     *
     * @param pkEsid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkEsid);

}