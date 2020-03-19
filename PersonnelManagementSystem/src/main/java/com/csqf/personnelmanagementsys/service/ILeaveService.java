package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.Leave;

import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface ILeaveService {

    /**
     * 获取所有的请假记录
     * @return
     */
    List<Leave> getAllLeave();

    /**
     * 根据主键获取请假记录
     * @param pk_id
     * @return
     */
    Leave getLeaveByPKId(int pk_id);

    /**
     * 根据申请人id获取请假记录
     * @param proposerId
     * @return
     */
    Leave getLeaveByProposerId(int proposerId);

    /**
     * 根据审核人id获取请假记录
     * @param verifierId
     * @return
     */
    Leave getLeaveByVerifierId(int verifierId);


}
