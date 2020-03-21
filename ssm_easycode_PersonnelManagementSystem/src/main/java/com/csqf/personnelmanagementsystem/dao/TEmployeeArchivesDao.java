package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TEmployeeArchives;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 员工档案(TEmployeeArchives)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 21:12:44
 */
public interface TEmployeeArchivesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAid 主键
     * @return 实例对象
     */
    TEmployeeArchives queryById(Integer pkAid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeArchives> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tEmployeeArchives 实例对象
     * @return 对象列表
     */
    List<TEmployeeArchives> queryAll(TEmployeeArchives tEmployeeArchives);

    /**
     * 新增数据
     *
     * @param tEmployeeArchives 实例对象
     * @return 影响行数
     */
    int insert(TEmployeeArchives tEmployeeArchives);

    /**
     * 修改数据
     *
     * @param tEmployeeArchives 实例对象
     * @return 影响行数
     */
    int update(TEmployeeArchives tEmployeeArchives);

    /**
     * 通过主键删除数据
     *
     * @param pkAid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAid);

}