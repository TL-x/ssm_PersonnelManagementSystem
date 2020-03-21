package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceSigninType;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserAttendanceSigninType)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:20:04
 */
public interface TUserAttendanceSigninTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSitid 主键
     * @return 实例对象
     */
    TUserAttendanceSigninType queryById(Integer pkSitid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceSigninType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 对象列表
     */
    List<TUserAttendanceSigninType> queryAll(TUserAttendanceSigninType tUserAttendanceSigninType);

    /**
     * 新增数据
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 影响行数
     */
    int insert(TUserAttendanceSigninType tUserAttendanceSigninType);

    /**
     * 修改数据
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 影响行数
     */
    int update(TUserAttendanceSigninType tUserAttendanceSigninType);

    /**
     * 通过主键删除数据
     *
     * @param pkSitid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkSitid);

}