package com.csqf.personnelmanagementsys.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 请假
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
@Data
public class Leave {
    private int id;
    private Date start;
    private Date end;
    private String reason;
    private User proposer;
    private User verifier;
    private LeaveType leaveType;
}
