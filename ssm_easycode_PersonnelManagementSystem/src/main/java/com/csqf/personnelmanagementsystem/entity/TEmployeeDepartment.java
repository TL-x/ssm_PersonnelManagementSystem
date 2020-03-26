package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeDepartment)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:33:10
 */
public class TEmployeeDepartment implements Serializable {
    private static final long serialVersionUID = -43284514747189600L;
    
    private Integer pkDid;
    
    private String name;
    
    private String manager;
    
    private Integer tel;


    public Integer getPkDid() {
        return pkDid;
    }

    public void setPkDid(Integer pkDid) {
        this.pkDid = pkDid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

}