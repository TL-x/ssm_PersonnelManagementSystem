package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceSignoutType;
import com.csqf.personnelmanagementsystem.dao.TUserAttendanceSignoutTypeDao;
import com.csqf.personnelmanagementsystem.service.TUserAttendanceSignoutTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserAttendanceSignoutType)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:20:16
 */
@Service("tUserAttendanceSignoutTypeService")
public class TUserAttendanceSignoutTypeServiceImpl implements TUserAttendanceSignoutTypeService {
    @Resource
    private TUserAttendanceSignoutTypeDao tUserAttendanceSignoutTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkSotid 主键
     * @return 实例对象
     */
    @Override
    public TUserAttendanceSignoutType queryById(Integer pkSotid) {
        return this.tUserAttendanceSignoutTypeDao.queryById(pkSotid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserAttendanceSignoutType> queryAllByLimit(int offset, int limit) {
        return this.tUserAttendanceSignoutTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendanceSignoutType insert(TUserAttendanceSignoutType tUserAttendanceSignoutType) {
        this.tUserAttendanceSignoutTypeDao.insert(tUserAttendanceSignoutType);
        return tUserAttendanceSignoutType;
    }

    /**
     * 修改数据
     *
     * @param tUserAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendanceSignoutType update(TUserAttendanceSignoutType tUserAttendanceSignoutType) {
        this.tUserAttendanceSignoutTypeDao.update(tUserAttendanceSignoutType);
        return this.queryById(tUserAttendanceSignoutType.getPkSotid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkSotid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkSotid) {
        return this.tUserAttendanceSignoutTypeDao.deleteById(pkSotid) > 0;
    }
}