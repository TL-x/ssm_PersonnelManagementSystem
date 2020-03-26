package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendance;
import com.csqf.personnelmanagementsystem.dao.TEmployeeAttendanceDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeAttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeAttendance)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:29:50
 */
@Service("tEmployeeAttendanceService")
public class TEmployeeAttendanceServiceImpl implements TEmployeeAttendanceService {
    @Resource
    private TEmployeeAttendanceDao tEmployeeAttendanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendance queryById(Integer pkAtid) {
        return this.tEmployeeAttendanceDao.queryById(pkAtid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeAttendance> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeAttendanceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeAttendance 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendance insert(TEmployeeAttendance tEmployeeAttendance) {
        this.tEmployeeAttendanceDao.insert(tEmployeeAttendance);
        return tEmployeeAttendance;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeAttendance 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendance update(TEmployeeAttendance tEmployeeAttendance) {
        this.tEmployeeAttendanceDao.update(tEmployeeAttendance);
        return this.queryById(tEmployeeAttendance.getPkAtid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAtid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAtid) {
        return this.tEmployeeAttendanceDao.deleteById(pkAtid) > 0;
    }
}