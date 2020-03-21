package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserLeave;
import com.csqf.personnelmanagementsystem.dao.TUserLeaveDao;
import com.csqf.personnelmanagementsystem.service.TUserLeaveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserLeave)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:32:45
 */
@Service("tUserLeaveService")
public class TUserLeaveServiceImpl implements TUserLeaveService {
    @Resource
    private TUserLeaveDao tUserLeaveDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkLid 主键
     * @return 实例对象
     */
    @Override
    public TUserLeave queryById(Integer pkLid) {
        return this.tUserLeaveDao.queryById(pkLid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserLeave> queryAllByLimit(int offset, int limit) {
        return this.tUserLeaveDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserLeave 实例对象
     * @return 实例对象
     */
    @Override
    public TUserLeave insert(TUserLeave tUserLeave) {
        this.tUserLeaveDao.insert(tUserLeave);
        return tUserLeave;
    }

    /**
     * 修改数据
     *
     * @param tUserLeave 实例对象
     * @return 实例对象
     */
    @Override
    public TUserLeave update(TUserLeave tUserLeave) {
        this.tUserLeaveDao.update(tUserLeave);
        return this.queryById(tUserLeave.getPkLid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkLid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkLid) {
        return this.tUserLeaveDao.deleteById(pkLid) > 0;
    }
}