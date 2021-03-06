package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceTime;
import java.util.List;

/**
 * (TEmployeeAttendanceTime)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:32:47
 */
public interface TEmployeeAttendanceTimeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAttid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceTime queryById(Integer pkAttid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceTime> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceTime insert(TEmployeeAttendanceTime tEmployeeAttendanceTime);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceTime update(TEmployeeAttendanceTime tEmployeeAttendanceTime);

    /**
     * 通过主键删除数据
     *
     * @param pkAttid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAttid);

}