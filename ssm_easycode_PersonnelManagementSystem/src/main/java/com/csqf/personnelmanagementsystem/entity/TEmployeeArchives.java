package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * 员工档案(TEmployeeArchives)实体类
 *
 * @author makejava
 * @since 2020-03-25 21:29:22
 */
public class TEmployeeArchives implements Serializable {
    private static final long serialVersionUID = 877253088825984522L;
    
    private Integer pkAid;
    
    private String name;
    
    private Integer age;
    
    private String sex;
    
    private String img;
    
    private String idcard;
    /**
    * 籍贯
    */
    private String nativeplace;
    /**
    * 政治面貌
    */
    private String politicsstatus;
    
    private Integer tel;
    
    private String email;
    /**
    * 学历
    */
    private String education;
    /**
    * 大学
    */
    private String university;
    /**
    * 专业
    */
    private String major;


    public Integer getPkAid() {
        return pkAid;
    }

    public void setPkAid(Integer pkAid) {
        this.pkAid = pkAid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getPoliticsstatus() {
        return politicsstatus;
    }

    public void setPoliticsstatus(String politicsstatus) {
        this.politicsstatus = politicsstatus;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}