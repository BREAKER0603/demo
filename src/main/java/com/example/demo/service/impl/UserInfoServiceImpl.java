package com.example.demo.service.impl;

import com.example.demo.core.configurer.ServiceException;
import com.example.demo.core.universal.AbstractService;
import com.example.demo.dao.db1.UserInfoMapper;
import com.example.demo.model.UserInfo;
import com.example.demo.model.base.PageModel;
import com.example.demo.service.UserInfoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 21:09 2018/5/29
 * @modified By
 */
@Service
public class UserInfoServiceImpl extends AbstractService<UserInfo> implements UserInfoService  {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override

    public UserInfo selectById(Integer id) {
        UserInfo userInfo = userInfoMapper.selectById(id);
        if (userInfo == null) {
            throw new ServiceException("暂无该用户");
        }
        return userInfo;
    }

    @Override
    public PageInfo<UserInfo> selectAll(Integer page, Integer size) {
        //开启分页查询，写在查询语句上方
        //只有紧跟在PageHelper.startPage方法后的第一个Mybatis的查询（Select）方法会被分页。
        PageModel pageModel = new PageModel();
        pageModel.enablePaging(page,size);
        List<UserInfo> userInfoList = userInfoMapper.selectAll();
        PageInfo<UserInfo> pageInfo = new PageInfo<>(userInfoList);
        return pageInfo;

    }
}



