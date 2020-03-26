package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeSalary;
import com.csqf.personnelmanagementsystem.dao.TEmployeeSalaryDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeSalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeSalary)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:34:34
 */
@Service("tEmployeeSalaryService")
public class TEmployeeSalaryServiceImpl implements TEmployeeSalaryService {
    @Resource
    private TEmployeeSalaryDao tEmployeeSalaryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkEsid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeSalary queryById(Integer pkEsid) {
        return this.tEmployeeSalaryDao.queryById(pkEsid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeSalary> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeSalaryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeSalary 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeSalary insert(TEmployeeSalary tEmployeeSalary) {
        this.tEmployeeSalaryDao.insert(tEmployeeSalary);
        return tEmployeeSalary;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeSalary 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeSalary update(TEmployeeSalary tEmployeeSalary) {
        this.tEmployeeSalaryDao.update(tEmployeeSalary);
        return this.queryById(tEmployeeSalary.getPkEsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkEsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkEsid) {
        return this.tEmployeeSalaryDao.deleteById(pkEsid) > 0;
    }
}