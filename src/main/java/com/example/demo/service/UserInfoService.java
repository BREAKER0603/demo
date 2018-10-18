package com.example.demo.service;

import com.example.demo.core.universal.Service;
import com.example.demo.model.UserInfo;
import com.github.pagehelper.PageInfo;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 21:07 2018/5/29
 * @modified By
 */
public interface UserInfoService extends Service<UserInfo>{
    UserInfo selectById(Integer id);
    PageInfo<UserInfo> selectAll(Integer page,Integer size);
}
