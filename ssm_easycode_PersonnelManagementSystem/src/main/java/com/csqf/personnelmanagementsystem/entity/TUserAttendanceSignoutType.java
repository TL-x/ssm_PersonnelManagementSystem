package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserAttendanceSignoutType)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:20:16
 */
public class TUserAttendanceSignoutType implements Serializable {
    private static final long serialVersionUID = -59758199013373903L;
    
    private Integer pkSotid;
    
    private String name;


    public Integer getPkSotid() {
        return pkSotid;
    }

    public void setPkSotid(Integer pkSotid) {
        this.pkSotid = pkSotid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}