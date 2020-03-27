package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserInfomation;
import com.csqf.personnelmanagementsystem.dao.TUserInfomationDao;
import com.csqf.personnelmanagementsystem.service.TUserInfomationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserInfomation)表服务实现类
 *
 * @author makejava
 * @since 2020-03-25 21:36:17
 */
@Service("tUserInfomationService")
public class TUserInfomationServiceImpl implements TUserInfomationService {
    @Resource
    private TUserInfomationDao tUserInfomationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    @Override
    public TUserInfomation queryById(Integer pkUid) {
        return this.tUserInfomationDao.queryById(pkUid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserInfomation> queryAllByLimit(int offset, int limit) {
        return this.tUserInfomationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserInfomation 实例对象
     * @return 实例对象
     */
    @Override
    public TUserInfomation insert(TUserInfomation tUserInfomation) {
        this.tUserInfomationDao.insert(tUserInfomation);
        return tUserInfomation;
    }

    /**
     * 修改数据
     *
     * @param tUserInfomation 实例对象
     * @return 实例对象
     */
    @Override
    public TUserInfomation update(TUserInfomation tUserInfomation) {
        int isUpdate = this.tUserInfomationDao.update(tUserInfomation);
        if (1 != isUpdate){
            return null;
        }
        return this.queryById(tUserInfomation.getPkUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkUid) {
        return this.tUserInfomationDao.deleteById(pkUid) > 0;
    }

    @Override
    public TUserInfomation verifyUser(TUserInfomation user) {
        TUserInfomation getUser = this.tUserInfomationDao.queryUserByUser(user);
        if (null == getUser){
            return null;
        }
        return getUser;
    }
}