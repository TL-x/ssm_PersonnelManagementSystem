package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceTime;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeAttendanceTime)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:32:47
 */
public interface TEmployeeAttendanceTimeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAttid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceTime queryById(Integer pkAttid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceTime> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 对象列表
     */
    List<TEmployeeAttendanceTime> queryAll(TEmployeeAttendanceTime tEmployeeAttendanceTime);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeAttendanceTime tEmployeeAttendanceTime);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 影响行数
     */
    int update(TEmployeeAttendanceTime tEmployeeAttendanceTime);

    /**
     * 通过主键删除数据
     *
     * @param pkAttid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAttid);

}