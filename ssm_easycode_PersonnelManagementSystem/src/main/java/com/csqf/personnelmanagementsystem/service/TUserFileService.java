package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserFile;
import java.util.List;

/**
 * (TUserFile)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:20:43
 */
public interface TUserFileService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkFid 主键
     * @return 实例对象
     */
    TUserFile queryById(Integer pkFid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserFile> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserFile 实例对象
     * @return 实例对象
     */
    TUserFile insert(TUserFile tUserFile);

    /**
     * 修改数据
     *
     * @param tUserFile 实例对象
     * @return 实例对象
     */
    TUserFile update(TUserFile tUserFile);

    /**
     * 通过主键删除数据
     *
     * @param pkFid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkFid);

}