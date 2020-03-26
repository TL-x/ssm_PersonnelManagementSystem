package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserRole;
import com.csqf.personnelmanagementsystem.dao.TUserRoleDao;
import com.csqf.personnelmanagementsystem.service.TUserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserRole)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:37:16
 */
@Service("tUserRoleService")
public class TUserRoleServiceImpl implements TUserRoleService {
    @Resource
    private TUserRoleDao tUserRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkRoid 主键
     * @return 实例对象
     */
    @Override
    public TUserRole queryById(Integer pkRoid) {
        return this.tUserRoleDao.queryById(pkRoid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserRole> queryAllByLimit(int offset, int limit) {
        return this.tUserRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRole insert(TUserRole tUserRole) {
        this.tUserRoleDao.insert(tUserRole);
        return tUserRole;
    }

    /**
     * 修改数据
     *
     * @param tUserRole 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRole update(TUserRole tUserRole) {
        this.tUserRoleDao.update(tUserRole);
        return this.queryById(tUserRole.getPkRoid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkRoid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkRoid) {
        return this.tUserRoleDao.deleteById(pkRoid) > 0;
    }
}