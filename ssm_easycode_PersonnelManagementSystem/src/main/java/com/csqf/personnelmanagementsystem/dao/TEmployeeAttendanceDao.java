package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendance;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeAttendance)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:29:50
 */
public interface TEmployeeAttendanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtid 主键
     * @return 实例对象
     */
    TEmployeeAttendance queryById(Integer pkAtid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeAttendance 实例对象
     * @return 对象列表
     */
    List<TEmployeeAttendance> queryAll(TEmployeeAttendance tEmployeeAttendance);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendance 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeAttendance tEmployeeAttendance);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendance 实例对象
     * @return 影响行数
     */
    int update(TEmployeeAttendance tEmployeeAttendance);

    /**
     * 通过主键删除数据
     *
     * @param pkAtid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAtid);

}