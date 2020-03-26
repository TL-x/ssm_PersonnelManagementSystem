package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceDetail;
import com.csqf.personnelmanagementsystem.dao.TEmployeeAttendanceDetailDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeAttendanceDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeAttendanceDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:30:15
 */
@Service("tEmployeeAttendanceDetailService")
public class TEmployeeAttendanceDetailServiceImpl implements TEmployeeAttendanceDetailService {
    @Resource
    private TEmployeeAttendanceDetailDao tEmployeeAttendanceDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtdid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceDetail queryById(Integer pkAtdid) {
        return this.tEmployeeAttendanceDetailDao.queryById(pkAtdid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeAttendanceDetail> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeAttendanceDetailDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceDetail insert(TEmployeeAttendanceDetail tEmployeeAttendanceDetail) {
        this.tEmployeeAttendanceDetailDao.insert(tEmployeeAttendanceDetail);
        return tEmployeeAttendanceDetail;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceDetail 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceDetail update(TEmployeeAttendanceDetail tEmployeeAttendanceDetail) {
        this.tEmployeeAttendanceDetailDao.update(tEmployeeAttendanceDetail);
        return this.queryById(tEmployeeAttendanceDetail.getPkAtdid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAtdid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAtdid) {
        return this.tEmployeeAttendanceDetailDao.deleteById(pkAtdid) > 0;
    }
}