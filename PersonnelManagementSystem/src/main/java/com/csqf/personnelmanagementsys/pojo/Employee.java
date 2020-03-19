package com.csqf.personnelmanagementsys.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 员工
 * @author Xu
 * @createTime 2020/3/14
 * @description
 */
@Data
public class Employee {
    private int eid;
    private Archive archive;
    private Position position;
    private Date joinTime;
    private String training;
    private int boss;
}
