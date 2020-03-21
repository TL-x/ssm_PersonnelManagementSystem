package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceTime;
import java.util.List;

/**
 * (TUserAttendanceTime)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:20:31
 */
public interface TUserAttendanceTimeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAttid 主键
     * @return 实例对象
     */
    TUserAttendanceTime queryById(Integer pkAttid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceTime> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserAttendanceTime 实例对象
     * @return 实例对象
     */
    TUserAttendanceTime insert(TUserAttendanceTime tUserAttendanceTime);

    /**
     * 修改数据
     *
     * @param tUserAttendanceTime 实例对象
     * @return 实例对象
     */
    TUserAttendanceTime update(TUserAttendanceTime tUserAttendanceTime);

    /**
     * 通过主键删除数据
     *
     * @param pkAttid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAttid);

}