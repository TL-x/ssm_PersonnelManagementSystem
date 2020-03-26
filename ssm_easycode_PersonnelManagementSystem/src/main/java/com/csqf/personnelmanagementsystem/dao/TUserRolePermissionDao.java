package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserRolePermission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserRolePermission)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:37:29
 */
public interface TUserRolePermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkPerid 主键
     * @return 实例对象
     */
    TUserRolePermission queryById(Integer pkPerid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRolePermission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserRolePermission 实例对象
     * @return 对象列表
     */
    List<TUserRolePermission> queryAll(TUserRolePermission tUserRolePermission);

    /**
     * 新增数据
     *
     * @param tUserRolePermission 实例对象
     * @return 影响行数
     */
    int insert(TUserRolePermission tUserRolePermission);

    /**
     * 修改数据
     *
     * @param tUserRolePermission 实例对象
     * @return 影响行数
     */
    int update(TUserRolePermission tUserRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param pkPerid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkPerid);

}