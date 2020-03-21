package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserAttendance;
import com.csqf.personnelmanagementsystem.dao.TUserAttendanceDao;
import com.csqf.personnelmanagementsystem.service.TUserAttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserAttendance)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:19:34
 */
@Service("tUserAttendanceService")
public class TUserAttendanceServiceImpl implements TUserAttendanceService {
    @Resource
    private TUserAttendanceDao tUserAttendanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtid 主键
     * @return 实例对象
     */
    @Override
    public TUserAttendance queryById(Integer pkAtid) {
        return this.tUserAttendanceDao.queryById(pkAtid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserAttendance> queryAllByLimit(int offset, int limit) {
        return this.tUserAttendanceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserAttendance 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendance insert(TUserAttendance tUserAttendance) {
        this.tUserAttendanceDao.insert(tUserAttendance);
        return tUserAttendance;
    }

    /**
     * 修改数据
     *
     * @param tUserAttendance 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendance update(TUserAttendance tUserAttendance) {
        this.tUserAttendanceDao.update(tUserAttendance);
        return this.queryById(tUserAttendance.getPkAtid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAtid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAtid) {
        return this.tUserAttendanceDao.deleteById(pkAtid) > 0;
    }
}