package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeAttendanceSigninType;
import com.csqf.personnelmanagementsystem.dao.TEmployeeAttendanceSigninTypeDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeAttendanceSigninTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeAttendanceSigninType)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:31:18
 */
@Service("tEmployeeAttendanceSigninTypeService")
public class TEmployeeAttendanceSigninTypeServiceImpl implements TEmployeeAttendanceSigninTypeService {
    @Resource
    private TEmployeeAttendanceSigninTypeDao tEmployeeAttendanceSigninTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkSitid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceSigninType queryById(Integer pkSitid) {
        return this.tEmployeeAttendanceSigninTypeDao.queryById(pkSitid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeAttendanceSigninType> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeAttendanceSigninTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceSigninType insert(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType) {
        this.tEmployeeAttendanceSigninTypeDao.insert(tEmployeeAttendanceSigninType);
        return tEmployeeAttendanceSigninType;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeAttendanceSigninType 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeAttendanceSigninType update(TEmployeeAttendanceSigninType tEmployeeAttendanceSigninType) {
        this.tEmployeeAttendanceSigninTypeDao.update(tEmployeeAttendanceSigninType);
        return this.queryById(tEmployeeAttendanceSigninType.getPkSitid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkSitid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkSitid) {
        return this.tEmployeeAttendanceSigninTypeDao.deleteById(pkSitid) > 0;
    }
}