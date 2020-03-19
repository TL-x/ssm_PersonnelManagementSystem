package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.User;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface IUserService {

    /**
     * 根据主键查询到用户
     * @param pk_id
     * @return
     */
    User getUserByPKId(int pk_id);

    User getUserByUser(User user);
}
