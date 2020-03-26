package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeAttendanceDetail)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:30:15
 */
public class TEmployeeAttendanceDetail implements Serializable {
    private static final long serialVersionUID = 547787651882131572L;
    
    private Integer pkAtdid;
    
    private Integer fkSignoutid;
    
    private Integer fkSigninid;
    
    private Integer isleave;
    
    private Integer fkAtid;


    public Integer getPkAtdid() {
        return pkAtdid;
    }

    public void setPkAtdid(Integer pkAtdid) {
        this.pkAtdid = pkAtdid;
    }

    public Integer getFkSignoutid() {
        return fkSignoutid;
    }

    public void setFkSignoutid(Integer fkSignoutid) {
        this.fkSignoutid = fkSignoutid;
    }

    public Integer getFkSigninid() {
        return fkSigninid;
    }

    public void setFkSigninid(Integer fkSigninid) {
        this.fkSigninid = fkSigninid;
    }

    public Integer getIsleave() {
        return isleave;
    }

    public void setIsleave(Integer isleave) {
        this.isleave = isleave;
    }

    public Integer getFkAtid() {
        return fkAtid;
    }

    public void setFkAtid(Integer fkAtid) {
        this.fkAtid = fkAtid;
    }

}