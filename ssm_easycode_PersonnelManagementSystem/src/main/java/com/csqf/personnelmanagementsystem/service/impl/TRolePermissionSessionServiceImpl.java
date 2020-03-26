package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TRolePermissionSession;
import com.csqf.personnelmanagementsystem.dao.TRolePermissionSessionDao;
import com.csqf.personnelmanagementsystem.service.TRolePermissionSessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TRolePermissionSession)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:36:01
 */
@Service("tRolePermissionSessionService")
public class TRolePermissionSessionServiceImpl implements TRolePermissionSessionService {
    @Resource
    private TRolePermissionSessionDao tRolePermissionSessionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkRoid 主键
     * @return 实例对象
     */
    @Override
    public TRolePermissionSession queryById(Integer pkRoid) {
        return this.tRolePermissionSessionDao.queryById(pkRoid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TRolePermissionSession> queryAllByLimit(int offset, int limit) {
        return this.tRolePermissionSessionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tRolePermissionSession 实例对象
     * @return 实例对象
     */
    @Override
    public TRolePermissionSession insert(TRolePermissionSession tRolePermissionSession) {
        this.tRolePermissionSessionDao.insert(tRolePermissionSession);
        return tRolePermissionSession;
    }

    /**
     * 修改数据
     *
     * @param tRolePermissionSession 实例对象
     * @return 实例对象
     */
    @Override
    public TRolePermissionSession update(TRolePermissionSession tRolePermissionSession) {
        this.tRolePermissionSessionDao.update(tRolePermissionSession);
        return this.queryById(tRolePermissionSession.getPkRoid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkRoid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkRoid) {
        return this.tRolePermissionSessionDao.deleteById(pkRoid) > 0;
    }
}