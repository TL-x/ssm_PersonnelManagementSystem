package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserRoleSession;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserRoleSession)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:37:41
 */
public interface TUserRoleSessionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    TUserRoleSession queryById(Integer pkUid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserRoleSession> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserRoleSession 实例对象
     * @return 对象列表
     */
    List<TUserRoleSession> queryAll(TUserRoleSession tUserRoleSession);

    /**
     * 新增数据
     *
     * @param tUserRoleSession 实例对象
     * @return 影响行数
     */
    int insert(TUserRoleSession tUserRoleSession);

    /**
     * 修改数据
     *
     * @param tUserRoleSession 实例对象
     * @return 影响行数
     */
    int update(TUserRoleSession tUserRoleSession);

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkUid);

}