package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeInfomation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TEmployeeInfomation)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:33:21
 */
public interface TEmployeeInfomationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEid 主键
     * @return 实例对象
     */
    TEmployeeInfomation queryById(Integer pkEid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeInfomation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeInfomation 实例对象
     * @return 对象列表
     */
    List<TEmployeeInfomation> queryAll(TEmployeeInfomation tEmployeeInfomation);

    /**
     * 新增数据
     *
     * @param tEmployeeInfomation 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeInfomation tEmployeeInfomation);

    /**
     * 修改数据
     *
     * @param tEmployeeInfomation 实例对象
     * @return 影响行数
     */
    int update(TEmployeeInfomation tEmployeeInfomation);

    /**
     * 通过主键删除数据
     *
     * @param pkEid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkEid);

}