package com.csqf.personnelmanagementsys.mapper;

import com.csqf.personnelmanagementsys.pojo.User;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface IUserDao {

    /**
     * 根据主键查询到用户
     * @param pk_id
     * @return
     */
    User getUserByPKId(int pk_id);

    /**
     * 根据传入的User对象查询数据库是否含有这个对象
     * @param user
     * @return
     */
    User getUserByUser(User user);
}
