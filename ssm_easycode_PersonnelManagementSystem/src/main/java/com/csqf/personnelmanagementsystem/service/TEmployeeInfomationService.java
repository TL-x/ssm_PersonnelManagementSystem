package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeInfomation;
import java.util.List;

/**
 * (TEmployeeInfomation)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:17:18
 */
public interface TEmployeeInfomationService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEid 主键
     * @return 实例对象
     */
    TEmployeeInfomation queryById(Integer pkEid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeInfomation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeInfomation 实例对象
     * @return 实例对象
     */
    TEmployeeInfomation insert(TEmployeeInfomation tEmployeeInfomation);

    /**
     * 修改数据
     *
     * @param tEmployeeInfomation 实例对象
     * @return 实例对象
     */
    TEmployeeInfomation update(TEmployeeInfomation tEmployeeInfomation);

    /**
     * 通过主键删除数据
     *
     * @param pkEid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkEid);

}