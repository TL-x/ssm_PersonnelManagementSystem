package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUserAttendance)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:19:34
 */
public class TUserAttendance implements Serializable {
    private static final long serialVersionUID = -39562381546357426L;
    
    private Integer pkAtid;
    
    private Integer fkAttid;
    
    private Integer fkUid;
    
    private Date date;


    public Integer getPkAtid() {
        return pkAtid;
    }

    public void setPkAtid(Integer pkAtid) {
        this.pkAtid = pkAtid;
    }

    public Integer getFkAttid() {
        return fkAttid;
    }

    public void setFkAttid(Integer fkAttid) {
        this.fkAttid = fkAttid;
    }

    public Integer getFkUid() {
        return fkUid;
    }

    public void setFkUid(Integer fkUid) {
        this.fkUid = fkUid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}