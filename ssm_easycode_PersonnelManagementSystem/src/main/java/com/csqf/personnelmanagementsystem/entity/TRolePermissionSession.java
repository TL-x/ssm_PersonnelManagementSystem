package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TRolePermissionSession)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:35:58
 */
public class TRolePermissionSession implements Serializable {
    private static final long serialVersionUID = -66996529042277542L;
    
    private Integer pkRoid;
    
    private Integer pkPerid;


    public Integer getPkRoid() {
        return pkRoid;
    }

    public void setPkRoid(Integer pkRoid) {
        this.pkRoid = pkRoid;
    }

    public Integer getPkPerid() {
        return pkPerid;
    }

    public void setPkPerid(Integer pkPerid) {
        this.pkPerid = pkPerid;
    }

}