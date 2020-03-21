package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeDepartment;
import java.util.List;

/**
 * (TEmployeeDepartment)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:17:02
 */
public interface TEmployeeDepartmentService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkDid 主键
     * @return 实例对象
     */
    TEmployeeDepartment queryById(Integer pkDid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeDepartment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeDepartment 实例对象
     * @return 实例对象
     */
    TEmployeeDepartment insert(TEmployeeDepartment tEmployeeDepartment);

    /**
     * 修改数据
     *
     * @param tEmployeeDepartment 实例对象
     * @return 实例对象
     */
    TEmployeeDepartment update(TEmployeeDepartment tEmployeeDepartment);

    /**
     * 通过主键删除数据
     *
     * @param pkDid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkDid);

}