package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserAttendanceSigninType;
import java.util.List;

/**
 * (TUserAttendanceSigninType)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:20:04
 */
public interface TUserAttendanceSigninTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkSitid 主键
     * @return 实例对象
     */
    TUserAttendanceSigninType queryById(Integer pkSitid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserAttendanceSigninType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 实例对象
     */
    TUserAttendanceSigninType insert(TUserAttendanceSigninType tUserAttendanceSigninType);

    /**
     * 修改数据
     *
     * @param tUserAttendanceSigninType 实例对象
     * @return 实例对象
     */
    TUserAttendanceSigninType update(TUserAttendanceSigninType tUserAttendanceSigninType);

    /**
     * 通过主键删除数据
     *
     * @param pkSitid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkSitid);

}