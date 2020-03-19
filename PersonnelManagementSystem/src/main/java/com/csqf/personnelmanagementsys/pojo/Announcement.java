package com.csqf.personnelmanagementsys.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 公告
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
@Data
public class Announcement {
    private int anid;
    private String name;
    private String detail;
    private Date crtTime;
    private User user;

}
