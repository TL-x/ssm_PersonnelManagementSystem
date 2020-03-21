package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TEmployeeInfomation)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:17:18
 */
public class TEmployeeInfomation implements Serializable {
    private static final long serialVersionUID = -93103703803576485L;
    
    private Integer pkEid;
    
    private Integer fkPid;
    
    private Integer fkAid;
    
    private Date jointime;
    
    private String training;
    
    private Integer boss;


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

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public Integer getBoss() {
        return boss;
    }

    public void setBoss(Integer boss) {
        this.boss = boss;
    }

}