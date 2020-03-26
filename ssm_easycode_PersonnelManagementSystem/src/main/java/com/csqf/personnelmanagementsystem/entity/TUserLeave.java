package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUserLeave)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:36:41
 */
public class TUserLeave implements Serializable {
    private static final long serialVersionUID = -26469193429613304L;
    
    private Integer pkLid;
    
    private String proposer;
    
    private Integer fkVerifierid;
    
    private Date start;
    
    private Date end;
    
    private String reason;
    
    private Integer fkLtid;
    
    private Integer fkProposerid;


    public Integer getPkLid() {
        return pkLid;
    }

    public void setPkLid(Integer pkLid) {
        this.pkLid = pkLid;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public Integer getFkVerifierid() {
        return fkVerifierid;
    }

    public void setFkVerifierid(Integer fkVerifierid) {
        this.fkVerifierid = fkVerifierid;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getFkLtid() {
        return fkLtid;
    }

    public void setFkLtid(Integer fkLtid) {
        this.fkLtid = fkLtid;
    }

    public Integer getFkProposerid() {
        return fkProposerid;
    }

    public void setFkProposerid(Integer fkProposerid) {
        this.fkProposerid = fkProposerid;
    }

}