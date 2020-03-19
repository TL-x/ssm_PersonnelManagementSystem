package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.Position;

import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface IPositionService {

    /**
     * 根据主键获取职位
     * @param pk_id
     * @return
     */
    Position getPositionByPKId(int pk_id);

    /**
     * 获取所有的职位
     * @return
     */
    List<Position> getAllPosition();


}
