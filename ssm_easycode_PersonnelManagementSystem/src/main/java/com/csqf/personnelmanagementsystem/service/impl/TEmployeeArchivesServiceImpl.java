package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TEmployeeArchives;
import com.csqf.personnelmanagementsystem.dao.TEmployeeArchivesDao;
import com.csqf.personnelmanagementsystem.service.TEmployeeArchivesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 员工档案(TEmployeeArchives)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 21:12:48
 */
@Service("tEmployeeArchivesService")
public class TEmployeeArchivesServiceImpl implements TEmployeeArchivesService {
    @Resource
    private TEmployeeArchivesDao tEmployeeArchivesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAid 主键
     * @return 实例对象
     */
    @Override
    public TEmployeeArchives queryById(Integer pkAid) {
        return this.tEmployeeArchivesDao.queryById(pkAid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TEmployeeArchives> queryAllByLimit(int offset, int limit) {
        return this.tEmployeeArchivesDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tEmployeeArchives 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeArchives insert(TEmployeeArchives tEmployeeArchives) {
        this.tEmployeeArchivesDao.insert(tEmployeeArchives);
        return tEmployeeArchives;
    }

    /**
     * 修改数据
     *
     * @param tEmployeeArchives 实例对象
     * @return 实例对象
     */
    @Override
    public TEmployeeArchives update(TEmployeeArchives tEmployeeArchives) {
        this.tEmployeeArchivesDao.update(tEmployeeArchives);
        return this.queryById(tEmployeeArchives.getPkAid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAid) {
        return this.tEmployeeArchivesDao.deleteById(pkAid) > 0;
    }
}