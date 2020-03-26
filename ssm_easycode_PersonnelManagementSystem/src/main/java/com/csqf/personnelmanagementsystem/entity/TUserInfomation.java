package com.csqf.personnelmanagementsystem.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TUserInfomation)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:36:17
 */
@Data
public class TUserInfomation implements Serializable {
    private static final long serialVersionUID = 496603630396524563L;
    
    private Integer pkUid;
    
    private String username;
    
    private String password;




}