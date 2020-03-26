package com.csqf.personnelmanagementsystem.dto;

import lombok.Data;

/**
 * @author Xu
 * @createTime 2020/3/23
 * @description
 */
@Data
public class UserDto {
    private Integer pkUid;

    private String username;

    private String password;
}
