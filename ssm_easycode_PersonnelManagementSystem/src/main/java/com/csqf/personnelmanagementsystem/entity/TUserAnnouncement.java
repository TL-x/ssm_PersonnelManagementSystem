package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUserAnnouncement)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:32:01
 */
public class TUserAnnouncement implements Serializable {
    private static final long serialVersionUID = 397056970229959801L;
    
    private Integer pkAnid;
    
    private String name;
    
    private String details;
    
    private Date crttime;
    
    private Integer fkUid;


    public Integer getPkAnid() {
        return pkAnid;
    }

    public void setPkAnid(Integer pkAnid) {
        this.pkAnid = pkAnid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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