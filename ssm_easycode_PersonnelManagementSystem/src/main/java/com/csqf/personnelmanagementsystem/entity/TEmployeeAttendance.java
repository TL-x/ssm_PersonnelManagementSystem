package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TEmployeeAttendance)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:29:50
 */
public class TEmployeeAttendance implements Serializable {
    private static final long serialVersionUID = 663894008523384343L;
    
    private Integer pkAtid;
    
    private Integer fkAttid;
    
    private Date date;
    
    private Integer fkEid;


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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFkEid() {
        return fkEid;
    }

    public void setFkEid(Integer fkEid) {
        this.fkEid = fkEid;
    }

}