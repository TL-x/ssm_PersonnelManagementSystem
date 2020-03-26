package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeSalary)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:34:31
 */
public class TEmployeeSalary implements Serializable {
    private static final long serialVersionUID = -70856751728708155L;
    
    private Integer pkEsid;
    
    private Object salary;
    
    private String month;
    
    private Integer fkEid;


    public Integer getPkEsid() {
        return pkEsid;
    }

    public void setPkEsid(Integer pkEsid) {
        this.pkEsid = pkEsid;
    }

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getFkEid() {
        return fkEid;
    }

    public void setFkEid(Integer fkEid) {
        this.fkEid = fkEid;
    }

}