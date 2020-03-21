package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserLeaveType;
import java.util.List;

/**
 * (TUserLeaveType)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:32:57
 */
public interface TUserLeaveTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkTid 主键
     * @return 实例对象
     */
    TUserLeaveType queryById(Integer pkTid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserLeaveType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserLeaveType 实例对象
     * @return 实例对象
     */
    TUserLeaveType insert(TUserLeaveType tUserLeaveType);

    /**
     * 修改数据
     *
     * @param tUserLeaveType 实例对象
     * @return 实例对象
     */
    TUserLeaveType update(TUserLeaveType tUserLeaveType);

    /**
     * 通过主键删除数据
     *
     * @param pkTid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkTid);

}