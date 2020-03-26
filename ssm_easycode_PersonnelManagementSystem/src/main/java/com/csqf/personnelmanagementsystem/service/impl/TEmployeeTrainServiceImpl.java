package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeTrain;
import com.csqf.personnelmanagementsystem.dao.TEmployeeTrainDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeTrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TEmployeeTrain)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:34:51
 */
@Service("tEmployeeTrainService")
public class TEmployeeTrainServiceImpl implements TEmployeeTrainService {
    @Resource
    private TEmployeeTrainDao tEmployeeTrainDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkEtid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeTrain queryById(Integer pkEtid) {
        return this.tEmployeeTrainDao.queryById(pkEtid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeTrain> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeTrainDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeTrain 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeTrain insert(TEmployeeTrain tEmployeeTrain) {
        this.tEmployeeTrainDao.insert(tEmployeeTrain);
        return tEmployeeTrain;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeTrain 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeTrain update(TEmployeeTrain tEmployeeTrain) {
        this.tEmployeeTrainDao.update(tEmployeeTrain);
        return this.queryById(tEmployeeTrain.getPkEtid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkEtid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkEtid) {
        return this.tEmployeeTrainDao.deleteById(pkEtid) > 0;
    }
}