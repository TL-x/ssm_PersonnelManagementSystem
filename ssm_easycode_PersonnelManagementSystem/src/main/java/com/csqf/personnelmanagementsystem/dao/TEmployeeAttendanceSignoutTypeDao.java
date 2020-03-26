package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceSignoutType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeAttendanceSignoutType)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:32:24
 */
public interface TEmployeeAttendanceSignoutTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSotid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceSignoutType queryById(Integer pkSotid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceSignoutType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 对象列表
     */
    List<TEmployeeAttendanceSignoutType> queryAll(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 影响行数
     */
    int update(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType);

    /**
     * 通过主键删除数据
     *
     * @param pkSotid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkSotid);

}