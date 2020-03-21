package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserFile;
import com.csqf.personnelmanagementsystem.dao.TUserFileDao;
import com.csqf.personnelmanagementsystem.service.TUserFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserFile)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:20:43
 */
@Service("tUserFileService")
public class TUserFileServiceImpl implements TUserFileService {
    @Resource
    private TUserFileDao tUserFileDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkFid 主键
     * @return 实例对象
     */
    @Override
    public TUserFile queryById(Integer pkFid) {
        return this.tUserFileDao.queryById(pkFid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserFile> queryAllByLimit(int offset, int limit) {
        return this.tUserFileDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserFile 实例对象
     * @return 实例对象
     */
    @Override
    public TUserFile insert(TUserFile tUserFile) {
        this.tUserFileDao.insert(tUserFile);
        return tUserFile;
    }

    /**
     * 修改数据
     *
     * @param tUserFile 实例对象
     * @return 实例对象
     */
    @Override
    public TUserFile update(TUserFile tUserFile) {
        this.tUserFileDao.update(tUserFile);
        return this.queryById(tUserFile.getPkFid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkFid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkFid) {
        return this.tUserFileDao.deleteById(pkFid) > 0;
    }
}