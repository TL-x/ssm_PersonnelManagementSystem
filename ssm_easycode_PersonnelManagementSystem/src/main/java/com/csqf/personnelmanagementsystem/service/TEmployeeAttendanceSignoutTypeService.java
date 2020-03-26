package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceSignoutType;
import java.util.List;

/**
 * (TEmployeeAttendanceSignoutType)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:32:24
 */
public interface TEmployeeAttendanceSignoutTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSotid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceSignoutType queryById(Integer pkSotid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceSignoutType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceSignoutType insert(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceSignoutType update(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType);

    /**
     * 通过主键删除数据
     *
     * @param pkSotid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkSotid);

}