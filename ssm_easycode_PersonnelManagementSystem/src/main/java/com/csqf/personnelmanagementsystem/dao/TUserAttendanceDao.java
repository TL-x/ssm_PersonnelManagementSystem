package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserAttendance;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserAttendance)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:19:34
 */
public interface TUserAttendanceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtid 主键
     * @return 实例对象
     */
    TUserAttendance queryById(Integer pkAtid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendance> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserAttendance 实例对象
     * @return 对象列表
     */
    List<TUserAttendance> queryAll(TUserAttendance tUserAttendance);

    /**
     * 新增数据
     *
     * @param tUserAttendance 实例对象
     * @return 影响行数
     */
    int insert(TUserAttendance tUserAttendance);

    /**
     * 修改数据
     *
     * @param tUserAttendance 实例对象
     * @return 影响行数
     */
    int update(TUserAttendance tUserAttendance);

    /**
     * 通过主键删除数据
     *
     * @param pkAtid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAtid);

}