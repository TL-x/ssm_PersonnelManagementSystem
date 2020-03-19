package com.csqf.personnelmanagementsys.service.impl;

import com.csqf.personnelmanagementsys.mapper.IAnnouncementDao;
import com.csqf.personnelmanagementsys.pojo.Announcement;
import com.csqf.personnelmanagementsys.service.IAnnouncementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/17
 * @description
 */
@Service
public class AnnouncementServiceImpl implements IAnnouncementService {
    @Resource
    IAnnouncementDao announcementDao;
    @Override
    public List<Announcement> getAllAnnouncement() {
        return announcementDao.getAllAnnouncement();
    }

    @Override
    public Announcement getAnnouncementByPKId(int pk_id) {
        return announcementDao.getAnnouncementByPKId(pk_id);
    }
}
