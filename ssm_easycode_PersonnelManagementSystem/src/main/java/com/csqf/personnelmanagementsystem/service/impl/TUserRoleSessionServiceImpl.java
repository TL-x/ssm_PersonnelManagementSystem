package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserRoleSession;
import com.csqf.personnelmanagementsystem.dao.TUserRoleSessionDao;
import com.csqf.personnelmanagementsystem.service.TUserRoleSessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserRoleSession)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:37:41
 */
@Service("tUserRoleSessionService")
public class TUserRoleSessionServiceImpl implements TUserRoleSessionService {
    @Resource
    private TUserRoleSessionDao tUserRoleSessionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    @Override
    public TUserRoleSession queryById(Integer pkUid) {
        return this.tUserRoleSessionDao.queryById(pkUid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserRoleSession> queryAllByLimit(int offset, int limit) {
        return this.tUserRoleSessionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserRoleSession 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRoleSession insert(TUserRoleSession tUserRoleSession) {
        this.tUserRoleSessionDao.insert(tUserRoleSession);
        return tUserRoleSession;
    }

    /**
     * 修改数据
     *
     * @param tUserRoleSession 实例对象
     * @return 实例对象
     */
    @Override
    public TUserRoleSession update(TUserRoleSession tUserRoleSession) {
        this.tUserRoleSessionDao.update(tUserRoleSession);
        return this.queryById(tUserRoleSession.getPkUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkUid) {
        return this.tUserRoleSessionDao.deleteById(pkUid) > 0;
    }
}