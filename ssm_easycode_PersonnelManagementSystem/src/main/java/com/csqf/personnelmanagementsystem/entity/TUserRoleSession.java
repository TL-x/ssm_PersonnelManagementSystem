package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserRoleSession)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:37:41
 */
public class TUserRoleSession implements Serializable {
    private static final long serialVersionUID = -61901838844867981L;
    
    private Integer pkUid;
    
    private Integer pkRoid;


    public Integer getPkUid() {
        return pkUid;
    }

    public void setPkUid(Integer pkUid) {
        this.pkUid = pkUid;
    }

    public Integer getPkRoid() {
        return pkRoid;
    }

    public void setPkRoid(Integer pkRoid) {
        this.pkRoid = pkRoid;
    }

}