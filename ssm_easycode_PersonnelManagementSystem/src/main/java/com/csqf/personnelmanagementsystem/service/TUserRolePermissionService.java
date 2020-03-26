package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserRolePermission;
import java.util.List;

/**
 * (TUserRolePermission)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:37:29
 */
public interface TUserRolePermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkPerid 主键
     * @return 实例对象
     */
    TUserRolePermission queryById(Integer pkPerid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRolePermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserRolePermission 实例对象
     * @return 实例对象
     */
    TUserRolePermission insert(TUserRolePermission tUserRolePermission);

    /**
     * 修改数据
     *
     * @param tUserRolePermission 实例对象
     * @return 实例对象
     */
    TUserRolePermission update(TUserRolePermission tUserRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param pkPerid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkPerid);

}