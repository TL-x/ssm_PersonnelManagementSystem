package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeePosition;
import java.util.List;

/**
 * (TEmployeePosition)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:18:57
 */
public interface TEmployeePositionService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkPid 主键
     * @return 实例对象
     */
    TEmployeePosition queryById(Integer pkPid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeePosition> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeePosition 实例对象
     * @return 实例对象
     */
    TEmployeePosition insert(TEmployeePosition tEmployeePosition);

    /**
     * 修改数据
     *
     * @param tEmployeePosition 实例对象
     * @return 实例对象
     */
    TEmployeePosition update(TEmployeePosition tEmployeePosition);

    /**
     * 通过主键删除数据
     *
     * @param pkPid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkPid);

}