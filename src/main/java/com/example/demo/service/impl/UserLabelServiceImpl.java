package com.example.demo.service.impl;

import com.example.demo.core.universal.AbstractService;
import com.example.demo.dao.db2.UserLabelMapper;
import com.example.demo.model.UserLabel;
import com.example.demo.service.UserLabelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @Description: UserLabelService接口实现类
* @author SHUAIGUO
* @date 2018/07/02 20:02
*/
@Service
public class UserLabelServiceImpl extends AbstractService<UserLabel> implements UserLabelService {

@Resource
private UserLabelMapper userLabelMapper;

}