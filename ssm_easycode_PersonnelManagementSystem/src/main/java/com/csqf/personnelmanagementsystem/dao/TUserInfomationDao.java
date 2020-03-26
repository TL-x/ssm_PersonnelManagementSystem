package com.csqf.personnelmanagementsystem.dao;

import com.csqf.personnelmanagementsystem.entity.TUserInfomation;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TUserInfomation)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-25 21:36:17
 */
public interface TUserInfomationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param pkUid 主键
     * @return 实例对象
     */
    TUserInfomation queryById(Integer pkUid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUserInfomation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUserInfomation 实例对象
     * @return 对象列表
     */
    List<TUserInfomation> queryAll(TUserInfomation tUserInfomation);

    /**
     * 新增数据
     *
     * @param tUserInfomation 实例对象
     * @return 影响行数
     */
    int insert(TUserInfomation tUserInfomation);

    /**
     * 修改数据
     *
     * @param tUserInfomation 实例对象
     * @return 影响行数
     */
    int update(TUserInfomation tUserInfomation);

    /**
     * 通过主键删除数据
     *
     * @param pkUid 主键
     * @return 影响行数
     */
    int deleteById(Integer pkUid);

    /**
     * 查询user是否存在
     * @param user
     * @return
     */
    TUserInfomation queryUserByUser(TUserInfomation user);
}