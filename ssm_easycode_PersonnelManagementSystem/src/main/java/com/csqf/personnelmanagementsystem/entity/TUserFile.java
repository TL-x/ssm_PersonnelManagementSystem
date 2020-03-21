package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUserFile)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:20:43
 */
public class TUserFile implements Serializable {
    private static final long serialVersionUID = -33703309252232218L;
    
    private Integer pkFid;
    
    private String name;
    
    private String addr;
    
    private Date crttime;
    
    private Integer fkUid;


    public Integer getPkFid() {
        return pkFid;
    }

    public void setPkFid(Integer pkFid) {
        this.pkFid = pkFid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getCrttime() {
        return crttime;
    }

    public void setCrttime(Date crttime) {
        this.crttime = crttime;
    }

    public Integer getFkUid() {
        return fkUid;
    }

    public void setFkUid(Integer fkUid) {
        this.fkUid = fkUid;
    }

}