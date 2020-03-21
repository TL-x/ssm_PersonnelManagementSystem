package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeePosition)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:18:57
 */
public class TEmployeePosition implements Serializable {
    private static final long serialVersionUID = -87139216419751544L;
    
    private Integer pkPid;
    
    private String name;
    
    private Object saraly;
    
    private Integer fkDid;


    public Integer getPkPid() {
        return pkPid;
    }

    public void setPkPid(Integer pkPid) {
        this.pkPid = pkPid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getSaraly() {
        return saraly;
    }

    public void setSaraly(Object saraly) {
        this.saraly = saraly;
    }

    public Integer getFkDid() {
        return fkDid;
    }

    public void setFkDid(Integer fkDid) {
        this.fkDid = fkDid;
    }

}