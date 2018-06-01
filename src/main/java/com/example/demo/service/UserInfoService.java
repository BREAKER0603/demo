package com.example.demo.service;

import com.example.demo.model.UserInfo;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 21:07 2018/5/29
 * @modified By
 */
public interface UserInfoService {
    UserInfo selectById(Integer id);
}
