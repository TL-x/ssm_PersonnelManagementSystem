package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeDepartment;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeDepartment)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:33:10
 */
public interface TEmployeeDepartmentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkDid 主键
     * @return 实例对象
     */
    TEmployeeDepartment queryById(Integer pkDid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeDepartment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeDepartment 实例对象
     * @return 对象列表
     */
    List<TEmployeeDepartment> queryAll(TEmployeeDepartment tEmployeeDepartment);

    /**
     * 新增数据
     *
     * @param tEmployeeDepartment 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeDepartment tEmployeeDepartment);

    /**
     * 修改数据
     *
     * @param tEmployeeDepartment 实例对象
     * @return 影响行数
     */
    int update(TEmployeeDepartment tEmployeeDepartment);

    /**
     * 通过主键删除数据
     *
     * @param pkDid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkDid);

}