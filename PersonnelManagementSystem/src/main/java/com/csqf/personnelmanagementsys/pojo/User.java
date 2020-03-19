package com.csqf.personnelmanagementsys.pojo;

import lombok.Data;

/**
 * 用户
 * @author Xu
 * @createTime 2020/3/14
 * @description
 */
@Data
public class User {
    private int uid;
    private String username;
    private String password;
    private Employee employee;
}
