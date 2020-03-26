package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * (TEmployeeTrain)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:34:51
 */
public class TEmployeeTrain implements Serializable {
    private static final long serialVersionUID = -19196437720250562L;
    
    private Integer pkEtid;
    
    private Integer istraining;
    
    private String bak1;
    
    private String bak2;
    
    private String bak3;
    
    private String bak4;
    
    private String bak5;


    public Integer getPkEtid() {
        return pkEtid;
    }

    public void setPkEtid(Integer pkEtid) {
        this.pkEtid = pkEtid;
    }

    public Integer getIstraining() {
        return istraining;
    }

    public void setIstraining(Integer istraining) {
        this.istraining = istraining;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2;
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3;
    }

    public String getBak4() {
        return bak4;
    }

    public void setBak4(String bak4) {
        this.bak4 = bak4;
    }

    public String getBak5() {
        return bak5;
    }

    public void setBak5(String bak5) {
        this.bak5 = bak5;
    }

}