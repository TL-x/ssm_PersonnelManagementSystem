package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceSigninType;
import com.csqf.personnelmanagementsystem.dao.TUserAttendanceSigninTypeDao;
import com.csqf.personnelmanagementsystem.service.TUserAttendanceSigninTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserAttendanceSigninType)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:20:04
 */
@Service("tUserAttendanceSigninTypeService")
public class TUserAttendanceSigninTypeServiceImpl implements TUserAttendanceSigninTypeService {
    @Resource
    private TUserAttendanceSigninTypeDao tUserAttendanceSigninTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkSitid 主键
     * @return 实例对象
     */
    @Override
    public TUserAttendanceSigninType queryById(Integer pkSitid) {
        return this.tUserAttendanceSigninTypeDao.queryById(pkSitid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserAttendanceSigninType> queryAllByLimit(int offset, int limit) {
        return this.tUserAttendanceSigninTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendanceSigninType insert(TUserAttendanceSigninType tUserAttendanceSigninType) {
        this.tUserAttendanceSigninTypeDao.insert(tUserAttendanceSigninType);
        return tUserAttendanceSigninType;
    }

    /**
     * 修改数据
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAttendanceSigninType update(TUserAttendanceSigninType tUserAttendanceSigninType) {
        this.tUserAttendanceSigninTypeDao.update(tUserAttendanceSigninType);
        return this.queryById(tUserAttendanceSigninType.getPkSitid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkSitid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkSitid) {
        return this.tUserAttendanceSigninTypeDao.deleteById(pkSitid) > 0;
    }
}