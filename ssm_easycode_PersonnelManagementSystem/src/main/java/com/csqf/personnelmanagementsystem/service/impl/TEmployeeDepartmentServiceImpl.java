package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeDepartment;
import com.csqf.personnelmanagementsystem.dao.TEmployeeDepartmentDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeDepartment)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:17:02
 */
@Service("tEmployeeDepartmentService")
public class TEmployeeDepartmentServiceImpl implements TEmployeeDepartmentService {
    @Resource
    private TEmployeeDepartmentDao tEmployeeDepartmentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkDid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeDepartment queryById(Integer pkDid) {
        return this.tEmployeeDepartmentDao.queryById(pkDid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeDepartment> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeDepartmentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeDepartment insert(TEmployeeDepartment tEmployeeDepartment) {
        this.tEmployeeDepartmentDao.insert(tEmployeeDepartment);
        return tEmployeeDepartment;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeDepartment 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeDepartment update(TEmployeeDepartment tEmployeeDepartment) {
        this.tEmployeeDepartmentDao.update(tEmployeeDepartment);
        return this.queryById(tEmployeeDepartment.getPkDid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkDid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkDid) {
        return this.tEmployeeDepartmentDao.deleteById(pkDid) > 0;
    }
}