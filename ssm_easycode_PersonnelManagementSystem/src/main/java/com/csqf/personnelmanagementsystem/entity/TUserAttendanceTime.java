package com.csqf.personnelmanagementsystem.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TUserAttendanceTime)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:20:31
 */
public class TUserAttendanceTime implements Serializable {
    private static final long serialVersionUID = -51024408081471442L;
    
    private Integer pkAttid;
    
    private String name;
    
    private Date start;
    
    private Date end;


    public Integer getPkAttid() {
        return pkAttid;
    }

    public void setPkAttid(Integer pkAttid) {
        this.pkAttid = pkAttid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}