package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserInformation;
import com.csqf.personnelmanagementsystem.dao.TUserInformationDao;
import com.csqf.personnelmanagementsystem.service.TUserInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserInformation)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:32:25
 */
@Service("tUserInformationService")
public class TUserInformationServiceImpl implements TUserInformationService {
    @Resource
    private TUserInformationDao tUserInformationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    @Override
    public TUserInformation queryById(Integer pkUid) {
        return this.tUserInformationDao.queryById(pkUid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserInformation> queryAllByLimit(int offset, int limit) {
        return this.tUserInformationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserInformation 实例对象
     * @return 实例对象
     */
    @Override
    public TUserInformation insert(TUserInformation tUserInformation) {
        this.tUserInformationDao.insert(tUserInformation);
        return tUserInformation;
    }

    /**
     * 修改数据
     *
     * @param tUserInformation 实例对象
     * @return 实例对象
     */
    @Override
    public TUserInformation update(TUserInformation tUserInformation) {
        this.tUserInformationDao.update(tUserInformation);
        return this.queryById(tUserInformation.getPkUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkUid) {
        return this.tUserInformationDao.deleteById(pkUid) > 0;
    }
}