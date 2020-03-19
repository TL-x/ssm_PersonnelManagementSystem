package com.csqf.personnelmanagementsys.service.impl;

import com.csqf.personnelmanagementsys.mapper.IUserDao;
import com.csqf.personnelmanagementsys.pojo.User;
import com.csqf.personnelmanagementsys.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Xu
 * @createTime 2020/3/19
 * @description
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;


    @Override
    public User getUserByPKId(int pk_id) {
        return null;
    }

    @Override
    public User getUserByUser(User user) {

        return userDao.getUserByUser(user);
    }
}
