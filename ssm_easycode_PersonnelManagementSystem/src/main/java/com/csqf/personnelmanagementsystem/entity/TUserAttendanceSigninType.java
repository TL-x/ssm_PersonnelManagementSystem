package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserAttendanceSigninType)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:20:04
 */
public class TUserAttendanceSigninType implements Serializable {
    private static final long serialVersionUID = -48399085087838281L;
    
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