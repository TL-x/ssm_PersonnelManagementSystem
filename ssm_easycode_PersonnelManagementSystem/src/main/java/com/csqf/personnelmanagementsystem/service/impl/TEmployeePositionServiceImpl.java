package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeePosition;
import com.csqf.personnelmanagementsystem.dao.TEmployeePositionDao;
import com.csqf.personnelmanagementsystem.service.TEmployeePositionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeePosition)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:18:57
 */
@Service("tEmployeePositionService")
public class TEmployeePositionServiceImpl implements TEmployeePositionService {
    @Resource
    private TEmployeePositionDao tEmployeePositionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkPid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeePosition queryById(Integer pkPid) {
        return this.tEmployeePositionDao.queryById(pkPid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeePosition> queryAllByLimit(int offset, int limit) {
        return this.tEmployeePositionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeePosition 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeePosition insert(TEmployeePosition tEmployeePosition) {
        this.tEmployeePositionDao.insert(tEmployeePosition);
        return tEmployeePosition;
    }

    /**
     * 修改数据
     *
     * @param tEmployeePosition 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeePosition update(TEmployeePosition tEmployeePosition) {
        this.tEmployeePositionDao.update(tEmployeePosition);
        return this.queryById(tEmployeePosition.getPkPid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkPid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkPid) {
        return this.tEmployeePositionDao.deleteById(pkPid) > 0;
    }
}