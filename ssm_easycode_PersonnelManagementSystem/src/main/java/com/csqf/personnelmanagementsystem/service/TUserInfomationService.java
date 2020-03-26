package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserInfomation;
import java.util.List;

/**
 * (TUserInfomation)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:36:17
 */
public interface TUserInfomationService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    TUserInfomation queryById(Integer pkUid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserInfomation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserInfomation 实例对象
     * @return 实例对象
     */
    TUserInfomation insert(TUserInfomation tUserInfomation);

    /**
     * 修改数据
     *
     * @param tUserInfomation 实例对象
     * @return 实例对象
     */
    TUserInfomation update(TUserInfomation tUserInfomation);

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkUid);

    /**
     * 验证账号密码是否正确
     * @param user
     * @return
     */
    TUserInfomation verifyUser(TUserInfomation user);

}