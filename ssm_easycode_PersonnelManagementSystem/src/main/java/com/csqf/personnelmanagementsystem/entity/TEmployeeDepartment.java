package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeDepartment)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:17:02
 */
public class TEmployeeDepartment implements Serializable {
    private static final long serialVersionUID = -43602580826477336L;
    
    private Integer pkDid;
    
    private String name;


    public Integer getPkDid() {
        return pkDid;
    }

    public void setPkDid(Integer pkDid) {
        this.pkDid = pkDid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}