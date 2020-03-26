package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserRolePermission)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:37:29
 */
public class TUserRolePermission implements Serializable {
    private static final long serialVersionUID = -21802282287722431L;
    
    private Integer pkPerid;
    
    private String name;


    public Integer getPkPerid() {
        return pkPerid;
    }

    public void setPkPerid(Integer pkPerid) {
        this.pkPerid = pkPerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}