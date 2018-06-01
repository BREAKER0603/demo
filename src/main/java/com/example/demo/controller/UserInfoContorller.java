package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *
 * @Author:SHIGS
 * @Description
 * @Date Created in 21:39 2018/5/29
 * @modified By
 */
@RestController
@RequestMapping(value = "userInfo")
public class UserInfoContorller {
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping(value = "hello")
    public String hello() {
        return "hello Spring Boot";
    }

    @PostMapping(value = "selectById")
    public UserInfo selectById(Integer id) {
        return userInfoService.selectById(id);
    }
}
