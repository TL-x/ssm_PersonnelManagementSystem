package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceSignoutType;
import com.csqf.personnelmanagementsystem.dao.TEmployeeAttendanceSignoutTypeDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeAttendanceSignoutTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeAttendanceSignoutType)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:32:24
 */
@Service("tEmployeeAttendanceSignoutTypeService")
public class TEmployeeAttendanceSignoutTypeServiceImpl implements TEmployeeAttendanceSignoutTypeService {
    @Resource
    private TEmployeeAttendanceSignoutTypeDao tEmployeeAttendanceSignoutTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkSotid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceSignoutType queryById(Integer pkSotid) {
        return this.tEmployeeAttendanceSignoutTypeDao.queryById(pkSotid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeAttendanceSignoutType> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeAttendanceSignoutTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceSignoutType insert(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType) {
        this.tEmployeeAttendanceSignoutTypeDao.insert(tEmployeeAttendanceSignoutType);
        return tEmployeeAttendanceSignoutType;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceSignoutType 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceSignoutType update(TEmployeeAttendanceSignoutType tEmployeeAttendanceSignoutType) {
        this.tEmployeeAttendanceSignoutTypeDao.update(tEmployeeAttendanceSignoutType);
        return this.queryById(tEmployeeAttendanceSignoutType.getPkSotid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkSotid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkSotid) {
        return this.tEmployeeAttendanceSignoutTypeDao.deleteById(pkSotid) > 0;
    }
}