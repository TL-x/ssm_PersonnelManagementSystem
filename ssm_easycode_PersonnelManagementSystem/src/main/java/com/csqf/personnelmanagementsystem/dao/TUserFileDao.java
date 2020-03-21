package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserFile;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserFile)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:20:43
 */
public interface TUserFileDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkFid 主键
     * @return 实例对象
     */
    TUserFile queryById(Integer pkFid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserFile> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserFile 实例对象
     * @return 对象列表
     */
    List<TUserFile> queryAll(TUserFile tUserFile);

    /**
     * 新增数据
     *
     * @param tUserFile 实例对象
     * @return 影响行数
     */
    int insert(TUserFile tUserFile);

    /**
     * 修改数据
     *
     * @param tUserFile 实例对象
     * @return 影响行数
     */
    int update(TUserFile tUserFile);

    /**
     * 通过主键删除数据
     *
     * @param pkFid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkFid);

}