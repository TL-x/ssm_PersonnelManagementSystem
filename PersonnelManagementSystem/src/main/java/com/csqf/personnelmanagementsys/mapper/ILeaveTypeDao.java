package com.csqf.personnelmanagementsys.mapper;

import com.csqf.personnelmanagementsys.pojo.LeaveType;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface ILeaveTypeDao {

    /**
     * 根据主键查找请假类型web.xml
     * @param pk_id
     * @return
     */
    LeaveType getLeaveTypeByPKId(int pk_id);
}
