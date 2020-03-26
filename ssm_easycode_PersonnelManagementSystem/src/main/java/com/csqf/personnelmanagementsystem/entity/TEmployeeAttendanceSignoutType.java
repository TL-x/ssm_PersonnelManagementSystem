package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeAttendanceSignoutType)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:32:24
 */
public class TEmployeeAttendanceSignoutType implements Serializable {
    private static final long serialVersionUID = -93479029487172809L;
    
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