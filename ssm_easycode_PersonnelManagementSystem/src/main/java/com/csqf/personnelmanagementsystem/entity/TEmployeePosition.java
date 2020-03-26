package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeePosition)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:34:01
 */
public class TEmployeePosition implements Serializable {
    private static final long serialVersionUID = 882207540685316842L;
    
    private Integer pkPid;
    
    private String name;
    
    private Object salary;
    
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

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    public Integer getFkDid() {
        return fkDid;
    }

    public void setFkDid(Integer fkDid) {
        this.fkDid = fkDid;
    }

}