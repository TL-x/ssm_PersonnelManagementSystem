package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserLeave;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserLeave)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:36:41
 */
public interface TUserLeaveDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkLid 主键
     * @return 实例对象
     */
    TUserLeave queryById(Integer pkLid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserLeave> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserLeave 实例对象
     * @return 对象列表
     */
    List<TUserLeave> queryAll(TUserLeave tUserLeave);

    /**
     * 新增数据
     *
     * @param tUserLeave 实例对象
     * @return 影响行数
     */
    int insert(TUserLeave tUserLeave);

    /**
     * 修改数据
     *
     * @param tUserLeave 实例对象
     * @return 影响行数
     */
    int update(TUserLeave tUserLeave);

    /**
     * 通过主键删除数据
     *
     * @param pkLid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkLid);

}