package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceSignoutType;
import java.util.List;

/**
 * (TUserAttendanceSignoutType)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:20:16
 */
public interface TUserAttendanceSignoutTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSotid 主键
     * @return 实例对象
     */
    TUserAttendanceSignoutType queryById(Integer pkSotid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceSignoutType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    TUserAttendanceSignoutType insert(TUserAttendanceSignoutType tUserAttendanceSignoutType);

    /**
     * 修改数据
     *
     * @param tUserAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    TUserAttendanceSignoutType update(TUserAttendanceSignoutType tUserAttendanceSignoutType);

    /**
     * 通过主键删除数据
     *
     * @param pkSotid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkSotid);

}