package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceTime;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserAttendanceTime)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:20:31
 */
public interface TUserAttendanceTimeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAttid 主键
     * @return 实例对象
     */
    TUserAttendanceTime queryById(Integer pkAttid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceTime> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserAttendanceTime 实例对象
     * @return 对象列表
     */
    List<TUserAttendanceTime> queryAll(TUserAttendanceTime tUserAttendanceTime);

    /**
     * 新增数据
     *
     * @param tUserAttendanceTime 实例对象
     * @return 影响行数
     */
    int insert(TUserAttendanceTime tUserAttendanceTime);

    /**
     * 修改数据
     *
     * @param tUserAttendanceTime 实例对象
     * @return 影响行数
     */
    int update(TUserAttendanceTime tUserAttendanceTime);

    /**
     * 通过主键删除数据
     *
     * @param pkAttid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAttid);

}