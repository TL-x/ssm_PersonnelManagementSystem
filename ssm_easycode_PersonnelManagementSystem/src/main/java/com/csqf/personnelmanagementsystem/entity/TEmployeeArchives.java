package com.csqf.personnelmanagementsystem.entity;

import java.io.Serializable;

/**
 * 员工档案(TEmployeeArchives)实体类
 *
 * @author makejava
 * @since 2020-03-21 16:16:53
 */
public class TEmployeeArchives implements Serializable {
    private static final long serialVersionUID = -46751923089372531L;
    
    private Integer pkAid;
    
    private String name;
    
    private Integer age;
    
    private String sex;
    
    private String img;
    
    private String idcard;
    /**
    * 籍贯
    */
    private String nativePlace;
    /**
    * 政治面貌
    */
    private String politicsStatus;
    
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
    /**
    * 紧急联系人姓名
    */
    private String linkmanname;
    /**
    * 紧急联系人电话
    */
    private Integer linkmantel;
    /**
    * 紧急联系人关系
    */
    private String linkmanrelation;


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

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
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

    public String getLinkmanname() {
        return linkmanname;
    }

    public void setLinkmanname(String linkmanname) {
        this.linkmanname = linkmanname;
    }

    public Integer getLinkmantel() {
        return linkmantel;
    }

    public void setLinkmantel(Integer linkmantel) {
        this.linkmantel = linkmantel;
    }

    public String getLinkmanrelation() {
        return linkmanrelation;
    }

    public void setLinkmanrelation(String linkmanrelation) {
        this.linkmanrelation = linkmanrelation;
    }

}