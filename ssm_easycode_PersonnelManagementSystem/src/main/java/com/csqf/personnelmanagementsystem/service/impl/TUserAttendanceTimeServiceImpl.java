package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceTime;
import com.csqf.personnelmanagementsystem.dao.TUserAttendanceTimeDao;
import com.csqf.personnelmanagementsystem.service.TUserAttendanceTimeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserAttendanceTime)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:20:31
 */
@Service("tUserAttendanceTimeService")
public class TUserAttendanceTimeServiceImpl implements TUserAttendanceTimeService {
    @Resource
    private TUserAttendanceTimeDao tUserAttendanceTimeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAttid 主键
     * @return 实例对象
     */
    @Override
    public TUserAttendanceTime queryById(Integer pkAttid) {
        return this.tUserAttendanceTimeDao.queryById(pkAttid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserAttendanceTime> queryAllByLimit(int offset, int limit) {
        return this.tUserAttendanceTimeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserAttendanceTime 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendanceTime insert(TUserAttendanceTime tUserAttendanceTime) {
        this.tUserAttendanceTimeDao.insert(tUserAttendanceTime);
        return tUserAttendanceTime;
    }

    /**
     * 修改数据
     *
     * @param tUserAttendanceTime 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendanceTime update(TUserAttendanceTime tUserAttendanceTime) {
        this.tUserAttendanceTimeDao.update(tUserAttendanceTime);
        return this.queryById(tUserAttendanceTime.getPkAttid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAttid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAttid) {
        return this.tUserAttendanceTimeDao.deleteById(pkAttid) > 0;
    }
}