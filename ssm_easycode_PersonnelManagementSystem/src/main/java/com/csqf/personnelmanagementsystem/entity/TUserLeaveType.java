package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserLeaveType)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:37:03
 */
public class TUserLeaveType implements Serializable {
    private static final long serialVersionUID = 490173720879703695L;
    
    private Integer pkTid;
    
    private String name;


    public Integer getPkTid() {
        return pkTid;
    }

    public void setPkTid(Integer pkTid) {
        this.pkTid = pkTid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}