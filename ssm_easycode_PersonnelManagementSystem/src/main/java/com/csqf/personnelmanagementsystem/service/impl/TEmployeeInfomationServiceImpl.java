package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeInfomation;
import com.csqf.personnelmanagementsystem.dao.TEmployeeInfomationDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeInfomationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeInfomation)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:17:18
 */
@Service("tEmployeeInfomationService")
public class TEmployeeInfomationServiceImpl implements TEmployeeInfomationService {
    @Resource
    private TEmployeeInfomationDao tEmployeeInfomationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkEid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeInfomation queryById(Integer pkEid) {
        return this.tEmployeeInfomationDao.queryById(pkEid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeInfomation> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeInfomationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeInfomation 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeInfomation insert(TEmployeeInfomation tEmployeeInfomation) {
        this.tEmployeeInfomationDao.insert(tEmployeeInfomation);
        return tEmployeeInfomation;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeInfomation 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeInfomation update(TEmployeeInfomation tEmployeeInfomation) {
        this.tEmployeeInfomationDao.update(tEmployeeInfomation);
        return this.queryById(tEmployeeInfomation.getPkEid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkEid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkEid) {
        return this.tEmployeeInfomationDao.deleteById(pkEid) > 0;
    }
}