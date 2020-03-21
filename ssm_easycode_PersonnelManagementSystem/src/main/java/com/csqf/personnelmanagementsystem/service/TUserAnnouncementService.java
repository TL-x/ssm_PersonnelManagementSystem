package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserAnnouncement;
import java.util.List;

/**
 * (TUserAnnouncement)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:32:01
 */
public interface TUserAnnouncementService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAnid 主键
     * @return 实例对象
     */
    TUserAnnouncement queryById(Integer pkAnid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAnnouncement> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserAnnouncement 实例对象
     * @return 实例对象
     */
    TUserAnnouncement insert(TUserAnnouncement tUserAnnouncement);

    /**
     * 修改数据
     *
     * @param tUserAnnouncement 实例对象
     * @return 实例对象
     */
    TUserAnnouncement update(TUserAnnouncement tUserAnnouncement);

    /**
     * 通过主键删除数据
     *
     * @param pkAnid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAnid);

}