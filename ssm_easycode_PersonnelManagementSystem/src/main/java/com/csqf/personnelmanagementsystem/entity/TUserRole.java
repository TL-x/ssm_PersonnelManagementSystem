package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserRole)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:37:16
 */
public class TUserRole implements Serializable {
    private static final long serialVersionUID = -39628712354642955L;
    
    private Integer pkRoid;
    
    private String name;


    public Integer getPkRoid() {
        return pkRoid;
    }

    public void setPkRoid(Integer pkRoid) {
        this.pkRoid = pkRoid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}