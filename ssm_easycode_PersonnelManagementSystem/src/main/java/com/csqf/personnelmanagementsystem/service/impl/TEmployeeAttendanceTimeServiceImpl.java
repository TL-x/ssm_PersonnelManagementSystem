package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceTime;
import com.csqf.personnelmanagementsystem.dao.TEmployeeAttendanceTimeDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeAttendanceTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeAttendanceTime)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:32:47
 */
@Service("tEmployeeAttendanceTimeService")
public class TEmployeeAttendanceTimeServiceImpl implements TEmployeeAttendanceTimeService {
    @Resource
    private TEmployeeAttendanceTimeDao tEmployeeAttendanceTimeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAttid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceTime queryById(Integer pkAttid) {
        return this.tEmployeeAttendanceTimeDao.queryById(pkAttid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeAttendanceTime> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeAttendanceTimeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceTime insert(TEmployeeAttendanceTime tEmployeeAttendanceTime) {
        this.tEmployeeAttendanceTimeDao.insert(tEmployeeAttendanceTime);
        return tEmployeeAttendanceTime;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceTime 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceTime update(TEmployeeAttendanceTime tEmployeeAttendanceTime) {
        this.tEmployeeAttendanceTimeDao.update(tEmployeeAttendanceTime);
        return this.queryById(tEmployeeAttendanceTime.getPkAttid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAttid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAttid) {
        return this.tEmployeeAttendanceTimeDao.deleteById(pkAttid) > 0;
    }
}