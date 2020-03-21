package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceDetail;
import java.util.List;

/**
 * (TUserAttendanceDetail)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:19:49
 */
public interface TUserAttendanceDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtdid 主键
     * @return 实例对象
     */
    TUserAttendanceDetail queryById(Integer pkAtdid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceDetail> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserAttendanceDetail 实例对象
     * @return 实例对象
     */
    TUserAttendanceDetail insert(TUserAttendanceDetail tUserAttendanceDetail);

    /**
     * 修改数据
     *
     * @param tUserAttendanceDetail 实例对象
     * @return 实例对象
     */
    TUserAttendanceDetail update(TUserAttendanceDetail tUserAttendanceDetail);

    /**
     * 通过主键删除数据
     *
     * @param pkAtdid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAtdid);

}