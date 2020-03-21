package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserInformation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserInformation)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-21 16:32:25
 */
public interface TUserInformationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    TUserInformation queryById(Integer pkUid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserInformation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserInformation 实例对象
     * @return 对象列表
     */
    List<TUserInformation> queryAll(TUserInformation tUserInformation);

    /**
     * 新增数据
     *
     * @param tUserInformation 实例对象
     * @return 影响行数
     */
    int insert(TUserInformation tUserInformation);

    /**
     * 修改数据
     *
     * @param tUserInformation 实例对象
     * @return 影响行数
     */
    int update(TUserInformation tUserInformation);

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkUid);

}