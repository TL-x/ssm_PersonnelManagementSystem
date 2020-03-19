package com.csqf.personnelmanagementsys.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 文件
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
@Data
public class MyFile {
    private int fid;
    private String name;
    private String addr;
    private Date crtTile;
    private User user;
}
