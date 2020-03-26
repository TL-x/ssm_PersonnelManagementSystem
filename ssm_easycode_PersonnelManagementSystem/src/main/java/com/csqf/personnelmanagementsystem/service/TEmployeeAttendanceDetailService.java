package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceDetail;
import java.util.List;

/**
 * (TEmployeeAttendanceDetail)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:30:15
 */
public interface TEmployeeAttendanceDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtdid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceDetail queryById(Integer pkAtdid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceDetail 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceDetail insert(TEmployeeAttendanceDetail tEmployeeAttendanceDetail);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceDetail 实例对象
     * @return 实例对象
     */
    TEmployeeAttendanceDetail update(TEmployeeAttendanceDetail tEmployeeAttendanceDetail);

    /**
     * 通过主键删除数据
     *
     * @param pkAtdid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAtdid);

}