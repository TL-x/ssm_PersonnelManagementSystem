package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeAttendanceSigninType)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:31:18
 */
public class TEmployeeAttendanceSigninType implements Serializable {
    private static final long serialVersionUID = -27344078463395717L;
    
    private Integer pkSitid;
    
    private String name;


    public Integer getPkSitid() {
        return pkSitid;
    }

    public void setPkSitid(Integer pkSitid) {
        this.pkSitid = pkSitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}