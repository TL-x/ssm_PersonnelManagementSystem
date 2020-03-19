package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.Announcement;

import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/17
 * @description
 */
public interface IAnnouncementService {
    /**
     * 获取所有公告
     * @return
     */
    List<Announcement> getAllAnnouncement();

    /**
     * 根据主键获取公告
     * @param pk_id
     * @return
     */
    Announcement getAnnouncementByPKId(int pk_id);
}
