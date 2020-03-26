package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TEmployeePerformance)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:33:41
 */
public class TEmployeePerformance implements Serializable {
    private static final long serialVersionUID = -67231886544065241L;
    
    private Integer pkEpid;
    
    private Object reward;
    
    private Object punishment;
    
    private Date month;
    
    private Integer fkEid;


    public Integer getPkEpid() {
        return pkEpid;
    }

    public void setPkEpid(Integer pkEpid) {
        this.pkEpid = pkEpid;
    }

    public Object getReward() {
        return reward;
    }

    public void setReward(Object reward) {
        this.reward = reward;
    }

    public Object getPunishment() {
        return punishment;
    }

    public void setPunishment(Object punishment) {
        this.punishment = punishment;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Integer getFkEid() {
        return fkEid;
    }

    public void setFkEid(Integer fkEid) {
        this.fkEid = fkEid;
    }

}