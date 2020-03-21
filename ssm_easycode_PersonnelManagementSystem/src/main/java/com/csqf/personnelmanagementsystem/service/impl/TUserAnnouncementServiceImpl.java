package com.csqf.personnelmanagementsystem.service.impl;

import com.csqf.personnelmanagementsystem.entity.TUserAnnouncement;
import com.csqf.personnelmanagementsystem.dao.TUserAnnouncementDao;
import com.csqf.personnelmanagementsystem.service.TUserAnnouncementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TUserAnnouncement)表服务实现类
 *
 * @author makejava
 * @since 2020-03-21 16:32:01
 */
@Service("tUserAnnouncementService")
public class TUserAnnouncementServiceImpl implements TUserAnnouncementService {
    @Resource
    private TUserAnnouncementDao tUserAnnouncementDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pkAnid 主键
     * @return 实例对象
     */
    @Override
    public TUserAnnouncement queryById(Integer pkAnid) {
        return this.tUserAnnouncementDao.queryById(pkAnid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUserAnnouncement> queryAllByLimit(int offset, int limit) {
        return this.tUserAnnouncementDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUserAnnouncement 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAnnouncement insert(TUserAnnouncement tUserAnnouncement) {
        this.tUserAnnouncementDao.insert(tUserAnnouncement);
        return tUserAnnouncement;
    }

    /**
     * 修改数据
     *
     * @param tUserAnnouncement 实例对象
     * @return 实例对象
     */
    @Override
    public TUserAnnouncement update(TUserAnnouncement tUserAnnouncement) {
        this.tUserAnnouncementDao.update(tUserAnnouncement);
        return this.queryById(tUserAnnouncement.getPkAnid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pkAnid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pkAnid) {
        return this.tUserAnnouncementDao.deleteById(pkAnid) > 0;
    }
}