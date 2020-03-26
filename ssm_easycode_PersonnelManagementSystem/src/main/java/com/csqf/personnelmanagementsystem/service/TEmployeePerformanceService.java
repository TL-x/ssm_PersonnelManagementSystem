package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeePerformance;
import java.util.List;

/**
 * (TEmployeePerformance)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:33:41
 */
public interface TEmployeePerformanceService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEpid 主键
     * @return 实例对象
     */
    TEmployeePerformance queryById(Integer pkEpid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeePerformance> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeePerformance 实例对象
     * @return 实例对象
     */
    TEmployeePerformance insert(TEmployeePerformance tEmployeePerformance);

    /**
     * 修改数据
     *
     * @param tEmployeePerformance 实例对象
     * @return 实例对象
     */
    TEmployeePerformance update(TEmployeePerformance tEmployeePerformance);

    /**
     * 通过主键删除数据
     *
     * @param pkEpid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkEpid);

}