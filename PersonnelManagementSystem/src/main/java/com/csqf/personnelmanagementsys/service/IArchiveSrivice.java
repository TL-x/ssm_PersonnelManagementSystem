package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.Archive;

import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/17
 * @description
 */
public interface IArchiveSrivice {

    /**
     * 根据主键获取档案
     * @param pk_id
     * @return
     */
    Archive getArchiveByPKId(int pk_id);

    /**
     * 获取所有的档案
     * @return
     */
    List<Archive> getAllArchive();
}
