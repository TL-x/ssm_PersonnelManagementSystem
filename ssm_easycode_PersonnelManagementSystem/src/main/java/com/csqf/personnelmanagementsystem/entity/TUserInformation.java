package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TUserInformation)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:32:25
 */
public class TUserInformation implements Serializable {
    private static final long serialVersionUID = 427371141872154748L;
    
    private Integer pkUid;
    
    private String username;
    
    private String password;
    
    private Integer fkEid;


    public Integer getPkUid() {
        return pkUid;
    }

    public void setPkUid(Integer pkUid) {
        this.pkUid = pkUid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFkEid() {
        return fkEid;
    }

    public void setFkEid(Integer fkEid) {
        this.fkEid = fkEid;
    }

}