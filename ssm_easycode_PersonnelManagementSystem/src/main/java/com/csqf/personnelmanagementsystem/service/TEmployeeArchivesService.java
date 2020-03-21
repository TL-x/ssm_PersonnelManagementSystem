package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeArchives;
import java.util.List;

/**
 * 员工档案(TEmployeeArchives)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:16:53
 */
public interface TEmployeeArchivesService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAid 主键
     * @return 实例对象
     */
    TEmployeeArchives queryById(Integer pkAid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeArchives> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeArchives 实例对象
     * @return 实例对象
     */
    TEmployeeArchives insert(TEmployeeArchives tEmployeeArchives);

    /**
     * 修改数据
     *
     * @param tEmployeeArchives 实例对象
     * @return 实例对象
     */
    TEmployeeArchives update(TEmployeeArchives tEmployeeArchives);

    /**
     * 通过主键删除数据
     *
     * @param pkAid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAid);

}