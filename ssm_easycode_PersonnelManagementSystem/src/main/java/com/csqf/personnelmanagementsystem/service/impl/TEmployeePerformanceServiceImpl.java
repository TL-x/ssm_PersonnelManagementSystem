package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeePerformance;
import com.csqf.personnelmanagementsystem.dao.TEmployeePerformanceDao;
import com.csqf.personnelmanagementsystem.service.TEmployeePerformanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeePerformance)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:33:41
 */
@Service("tEmployeePerformanceService")
public class TEmployeePerformanceServiceImpl implements TEmployeePerformanceService {
    @Resource
    private TEmployeePerformanceDao tEmployeePerformanceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkEpid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeePerformance queryById(Integer pkEpid) {
        return this.tEmployeePerformanceDao.queryById(pkEpid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeePerformance> queryAllByLimit(int offset, int limit) {
        return this.tEmployeePerformanceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeePerformance 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeePerformance insert(TEmployeePerformance tEmployeePerformance) {
        this.tEmployeePerformanceDao.insert(tEmployeePerformance);
        return tEmployeePerformance;
    }

    /**
     * 修改数据
     *
     * @param tEmployeePerformance 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeePerformance update(TEmployeePerformance tEmployeePerformance) {
        this.tEmployeePerformanceDao.update(tEmployeePerformance);
        return this.queryById(tEmployeePerformance.getPkEpid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkEpid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkEpid) {
        return this.tEmployeePerformanceDao.deleteById(pkEpid) > 0;
    }
}