package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserLeaveType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserLeaveType)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:37:03
 */
public interface TUserLeaveTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkTid 主键
     * @return 实例对象
     */
    TUserLeaveType queryById(Integer pkTid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserLeaveType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserLeaveType 实例对象
     * @return 对象列表
     */
    List<TUserLeaveType> queryAll(TUserLeaveType tUserLeaveType);

    /**
     * 新增数据
     *
     * @param tUserLeaveType 实例对象
     * @return 影响行数
     */
    int insert(TUserLeaveType tUserLeaveType);

    /**
     * 修改数据
     *
     * @param tUserLeaveType 实例对象
     * @return 影响行数
     */
    int update(TUserLeaveType tUserLeaveType);

    /**
     * 通过主键删除数据
     *
     * @param pkTid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkTid);

}