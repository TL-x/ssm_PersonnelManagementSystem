package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TRolePermissionSession;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TRolePermissionSession)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:35:59
 */
public interface TRolePermissionSessionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkRoid 主键
     * @return 实例对象
     */
    TRolePermissionSession queryById(Integer pkRoid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TRolePermissionSession> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tRolePermissionSession 实例对象
     * @return 对象列表
     */
    List<TRolePermissionSession> queryAll(TRolePermissionSession tRolePermissionSession);

    /**
     * 新增数据
     *
     * @param tRolePermissionSession 实例对象
     * @return 影响行数
     */
    int insert(TRolePermissionSession tRolePermissionSession);

    /**
     * 修改数据
     *
     * @param tRolePermissionSession 实例对象
     * @return 影响行数
     */
    int update(TRolePermissionSession tRolePermissionSession);

    /**
     * 通过主键删除数据
     *
     * @param pkRoid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkRoid);

}