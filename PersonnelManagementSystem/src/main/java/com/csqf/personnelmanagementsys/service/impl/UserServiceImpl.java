package com.csqf.personnelmanagementsys.service.impl;

import com.csqf.personnelmanagementsys.mapper.IUserDao;
import com.csqf.personnelmanagementsys.pojo.User;
import com.csqf.personnelmanagementsys.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
     public User verifyUser(User user){
        User getUser = userDao.getUserByUser(user);
        if (null != getUser){
            return getUser;
        }
        return null;
    }


}
