package com.example.demo.service.impl;

import com.example.demo.dao.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 21:09 2018/5/29
 * @modified By
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}
