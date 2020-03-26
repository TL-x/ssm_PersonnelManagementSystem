package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeTrain;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeTrain)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:34:51
 */
public interface TEmployeeTrainDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEtid 主键
     * @return 实例对象
     */
    TEmployeeTrain queryById(Integer pkEtid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeTrain> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeTrain 实例对象
     * @return 对象列表
     */
    List<TEmployeeTrain> queryAll(TEmployeeTrain tEmployeeTrain);

    /**
     * 新增数据
     *
     * @param tEmployeeTrain 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeTrain tEmployeeTrain);

    /**
     * 修改数据
     *
     * @param tEmployeeTrain 实例对象
     * @return 影响行数
     */
    int update(TEmployeeTrain tEmployeeTrain);

    /**
     * 通过主键删除数据
     *
     * @param pkEtid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkEtid);

}