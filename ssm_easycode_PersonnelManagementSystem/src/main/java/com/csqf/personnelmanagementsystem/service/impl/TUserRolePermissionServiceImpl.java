package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserRolePermission;
import com.csqf.personnelmanagementsystem.dao.TUserRolePermissionDao;
import com.csqf.personnelmanagementsystem.service.TUserRolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserRolePermission)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:37:29
 */
@Service("tUserRolePermissionService")
public class TUserRolePermissionServiceImpl implements TUserRolePermissionService {
    @Resource
    private TUserRolePermissionDao tUserRolePermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkPerid 主键
     * @return 实例对象
     */
    @Override
    public TUserRolePermission queryById(Integer pkPerid) {
        return this.tUserRolePermissionDao.queryById(pkPerid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserRolePermission> queryAllByLimit(int offset, int limit) {
        return this.tUserRolePermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRolePermission insert(TUserRolePermission tUserRolePermission) {
        this.tUserRolePermissionDao.insert(tUserRolePermission);
        return tUserRolePermission;
    }

    /**
     * 修改数据
     *
     * @param tUserRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRolePermission update(TUserRolePermission tUserRolePermission) {
        this.tUserRolePermissionDao.update(tUserRolePermission);
        return this.queryById(tUserRolePermission.getPkPerid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkPerid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkPerid) {
        return this.tUserRolePermissionDao.deleteById(pkPerid) > 0;
    }
}