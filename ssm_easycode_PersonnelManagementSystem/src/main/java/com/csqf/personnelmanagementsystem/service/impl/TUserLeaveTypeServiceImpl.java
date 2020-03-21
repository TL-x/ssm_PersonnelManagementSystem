package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserLeaveType;
import com.csqf.personnelmanagementsystem.dao.TUserLeaveTypeDao;
import com.csqf.personnelmanagementsystem.service.TUserLeaveTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserLeaveType)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:32:57
 */
@Service("tUserLeaveTypeService")
public class TUserLeaveTypeServiceImpl implements TUserLeaveTypeService {
    @Resource
    private TUserLeaveTypeDao tUserLeaveTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkTid 主键
     * @return 实例对象
     */
    @Override
    public TUserLeaveType queryById(Integer pkTid) {
        return this.tUserLeaveTypeDao.queryById(pkTid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserLeaveType> queryAllByLimit(int offset, int limit) {
        return this.tUserLeaveTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserLeaveType 实例对象
     * @return 实例对象
     */
    @Override
    public TUserLeaveType insert(TUserLeaveType tUserLeaveType) {
        this.tUserLeaveTypeDao.insert(tUserLeaveType);
        return tUserLeaveType;
    }

    /**
     * 修改数据
     *
     * @param tUserLeaveType 实例对象
     * @return 实例对象
     */
    @Override
    public TUserLeaveType update(TUserLeaveType tUserLeaveType) {
        this.tUserLeaveTypeDao.update(tUserLeaveType);
        return this.queryById(tUserLeaveType.getPkTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkTid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkTid) {
        return this.tUserLeaveTypeDao.deleteById(pkTid) > 0;
    }
}