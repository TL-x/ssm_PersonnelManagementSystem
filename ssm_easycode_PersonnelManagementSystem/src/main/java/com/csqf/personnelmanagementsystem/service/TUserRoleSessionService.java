package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserRoleSession;
import java.util.List;

/**
 * (TUserRoleSession)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:37:41
 */
public interface TUserRoleSessionService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    TUserRoleSession queryById(Integer pkUid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRoleSession> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserRoleSession 实例对象
     * @return 实例对象
     */
    TUserRoleSession insert(TUserRoleSession tUserRoleSession);

    /**
     * 修改数据
     *
     * @param tUserRoleSession 实例对象
     * @return 实例对象
     */
    TUserRoleSession update(TUserRoleSession tUserRoleSession);

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkUid);

}