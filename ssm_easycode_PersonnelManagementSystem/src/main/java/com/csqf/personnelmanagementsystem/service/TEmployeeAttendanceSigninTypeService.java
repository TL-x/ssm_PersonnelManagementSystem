package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceSigninType;
import java.util.List;

/**
 * (TEmployeeAttendanceSigninType)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:31:18
 */
public interface TEmployeeAttendanceSigninTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSitid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceSigninType queryById(Integer pkSitid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceSigninType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceSigninType insert(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceSigninType update(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType);

    /**
     * 通过主键删除数据
     *
     * @param pkSitid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkSitid);

}