package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceSigninType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeAttendanceSigninType)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:31:18
 */
public interface TEmployeeAttendanceSigninTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSitid 主键
     * @return 实例对象
     */
    TEmployeeAttendanceSigninType queryById(Integer pkSitid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeAttendanceSigninType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 对象列表
     */
    List<TEmployeeAttendanceSigninType> queryAll(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType);

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType);

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 影响行数
     */
    int update(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType);

    /**
     * 通过主键删除数据
     *
     * @param pkSitid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkSitid);

}