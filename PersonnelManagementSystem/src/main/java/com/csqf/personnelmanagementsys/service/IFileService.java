package com.csqf.personnelmanagementsys.service;

import com.csqf.personnelmanagementsys.pojo.MyFile;

import java.util.List;

/**
 * @author Xu
 * @createTime 2020/3/15
 * @description
 */
public interface IFileService {

    /**
     * 获取所有的文件
     * @return
     */
    List<MyFile> getAllFile();

    /**
     * 根据主键获取id
     * @param pk_id
     * @return
     */
    MyFile gerFileByPKId(int pk_id);
}
