package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.User;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

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

    /**
     * 验证用户账号密码是否正确
     * @param user
     * @return
     */
    User verifyUser(User user);


}
