package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeePosition;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeePosition)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:18:57
 */
public interface TEmployeePositionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkPid 主键
     * @return 实例对象
     */
    TEmployeePosition queryById(Integer pkPid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeePosition> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeePosition 实例对象
     * @return 对象列表
     */
    List<TEmployeePosition> queryAll(TEmployeePosition tEmployeePosition);

    /**
     * 新增数据
     *
     * @param tEmployeePosition 实例对象
     * @return 影响行数
     */
    int insert(TEmployeePosition tEmployeePosition);

    /**
     * 修改数据
     *
     * @param tEmployeePosition 实例对象
     * @return 影响行数
     */
    int update(TEmployeePosition tEmployeePosition);

    /**
     * 通过主键删除数据
     *
     * @param pkPid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkPid);

}