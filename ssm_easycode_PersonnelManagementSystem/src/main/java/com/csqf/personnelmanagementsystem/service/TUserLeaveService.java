package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserLeave;
import java.util.List;

/**
 * (TUserLeave)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:36:41
 */
public interface TUserLeaveService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkLid 主键
     * @return 实例对象
     */
    TUserLeave queryById(Integer pkLid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserLeave> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserLeave 实例对象
     * @return 实例对象
     */
    TUserLeave insert(TUserLeave tUserLeave);

    /**
     * 修改数据
     *
     * @param tUserLeave 实例对象
     * @return 实例对象
     */
    TUserLeave update(TUserLeave tUserLeave);

    /**
     * 通过主键删除数据
     *
     * @param pkLid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkLid);

}