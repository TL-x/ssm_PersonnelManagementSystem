package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserAttendance;
import java.util.List;

/**
 * (TUserAttendance)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:19:34
 */
public interface TUserAttendanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkAtid 主键
     * @return 实例对象
     */
    TUserAttendance queryById(Integer pkAtid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendance> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserAttendance 实例对象
     * @return 实例对象
     */
    TUserAttendance insert(TUserAttendance tUserAttendance);

    /**
     * 修改数据
     *
     * @param tUserAttendance 实例对象
     * @return 实例对象
     */
    TUserAttendance update(TUserAttendance tUserAttendance);

    /**
     * 通过主键删除数据
     *
     * @param pkAtid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkAtid);

}