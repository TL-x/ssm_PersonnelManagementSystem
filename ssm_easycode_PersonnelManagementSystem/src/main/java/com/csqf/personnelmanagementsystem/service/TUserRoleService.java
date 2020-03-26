package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserRole;
import java.util.List;

/**
 * (TUserRole)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:37:16
 */
public interface TUserRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkRoid 主键
     * @return 实例对象
     */
    TUserRole queryById(Integer pkRoid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    TUserRole insert(TUserRole tUserRole);

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    TUserRole update(TUserRole tUserRole);

    /**
     * 通过主键删除数据
     *
     * @param pkRoid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkRoid);

}