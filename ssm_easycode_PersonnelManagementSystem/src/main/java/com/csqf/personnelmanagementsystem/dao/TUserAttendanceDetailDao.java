package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceDetail;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserAttendanceDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:19:49
 */
public interface TUserAttendanceDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtdid 主键
     * @return 实例对象
     */
    TUserAttendanceDetail queryById(Integer pkAtdid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserAttendanceDetail 实例对象
     * @return 对象列表
     */
    List<TUserAttendanceDetail> queryAll(TUserAttendanceDetail tUserAttendanceDetail);

    /**
     * 新增数据
     *
     * @param tUserAttendanceDetail 实例对象
     * @return 影响行数
     */
    int insert(TUserAttendanceDetail tUserAttendanceDetail);

    /**
     * 修改数据
     *
     * @param tUserAttendanceDetail 实例对象
     * @return 影响行数
     */
    int update(TUserAttendanceDetail tUserAttendanceDetail);

    /**
     * 通过主键删除数据
     *
     * @param pkAtdid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAtdid);

}