package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.LeaveType;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface ILeaveTypeService {

    /**
     * 根据主键查找请假类型web.xml
     * @param pk_id
     * @return
     */
    LeaveType getLeaveTypeByPKId(int pk_id);
}
