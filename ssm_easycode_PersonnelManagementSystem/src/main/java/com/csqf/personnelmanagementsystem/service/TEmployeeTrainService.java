package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TEmployeeTrain;
import java.util.List;

/**
 * (TEmployeeTrain)表服务接口
 *
 * @author makejava
 * @since 2020-03-25 21:34:51
 */
public interface TEmployeeTrainService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkEtid 主键
     * @return 实例对象
     */
    TEmployeeTrain queryById(Integer pkEtid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TEmployeeTrain> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tEmployeeTrain 实例对象
     * @return 实例对象
     */
    TEmployeeTrain insert(TEmployeeTrain tEmployeeTrain);

    /**
     * 修改数据
     *
     * @param tEmployeeTrain 实例对象
     * @return 实例对象
     */
    TEmployeeTrain update(TEmployeeTrain tEmployeeTrain);

    /**
     * 通过主键删除数据
     *
     * @param pkEtid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkEtid);

}