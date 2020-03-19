package com.csqf.personnelmanagementsys.pojo;

import com.csqf.personnelmanagementsys.pojo.Department;
import lombok.Data;

/**
 * 职位
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
@Data
public class Position {
    private int pid;
    private String name;
    private double saraly;
    private Department department;
}
