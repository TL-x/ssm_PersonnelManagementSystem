package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TEmployeeInfomation)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:33:21
 */
public class TEmployeeInfomation implements Serializable {
    private static final long serialVersionUID = -43801330873119556L;
    
    private Integer pkEid;
    
    private Integer fkPid;
    
    private Integer fkAid;
    
    private Date jointime;
    
    private Integer boss;
    
    private Integer fkEtid;
    
    private Date positivedates;


    public Integer getPkEid() {
        return pkEid;
    }

    public void setPkEid(Integer pkEid) {
        this.pkEid = pkEid;
    }

    public Integer getFkPid() {
        return fkPid;
    }

    public void setFkPid(Integer fkPid) {
        this.fkPid = fkPid;
    }

    public Integer getFkAid() {
        return fkAid;
    }

    public void setFkAid(Integer fkAid) {
        this.fkAid = fkAid;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Integer getBoss() {
        return boss;
    }

    public void setBoss(Integer boss) {
        this.boss = boss;
    }

    public Integer getFkEtid() {
        return fkEtid;
    }

    public void setFkEtid(Integer fkEtid) {
        this.fkEtid = fkEtid;
    }

    public Date getPositivedates() {
        return positivedates;
    }

    public void setPositivedates(Date positivedates) {
        this.positivedates = positivedates;
    }

}