package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserAnnouncement;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserAnnouncement)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:32:01
 */
public interface TUserAnnouncementDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAnid 主键
     * @return 实例对象
     */
    TUserAnnouncement queryById(Integer pkAnid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAnnouncement> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserAnnouncement 实例对象
     * @return 对象列表
     */
    List<TUserAnnouncement> queryAll(TUserAnnouncement tUserAnnouncement);

    /**
     * 新增数据
     *
     * @param tUserAnnouncement 实例对象
     * @return 影响行数
     */
    int insert(TUserAnnouncement tUserAnnouncement);

    /**
     * 修改数据
     *
     * @param tUserAnnouncement 实例对象
     * @return 影响行数
     */
    int update(TUserAnnouncement tUserAnnouncement);

    /**
     * 通过主键删除数据
     *
     * @param pkAnid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkAnid);

}