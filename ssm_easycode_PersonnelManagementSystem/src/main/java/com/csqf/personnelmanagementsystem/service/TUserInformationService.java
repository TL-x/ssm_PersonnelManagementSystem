package com.csqf.personnelmanagementsystem.service;

import com.csqf.personnelmanagementsystem.entity.TUserInformation;
import java.util.List;

/**
 * (TUserInformation)表服务接口
 *
 * @author makejava
 * @since 2020-03-21 16:32:25
 */
public interface TUserInformationService {

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    TUserInformation queryById(Integer pkUid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserInformation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUserInformation 实例对象
     * @return 实例对象
     */
    TUserInformation insert(TUserInformation tUserInformation);

    /**
     * 修改数据
     *
     * @param tUserInformation 实例对象
     * @return 实例对象
     */
    TUserInformation update(TUserInformation tUserInformation);

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pkUid);

}