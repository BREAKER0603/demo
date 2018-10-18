package com.example.demo.service.impl;

import com.example.demo.dao.CheckLogMapper;
import com.example.demo.model.CheckLog;
import com.example.demo.service.CheckLogService;
import com.example.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: CheckLogService接口实现类
* @author SHUAIGUO
* @date 2018/08/27 15:43
*/
@Service
public class CheckLogServiceImpl extends AbstractService<CheckLog> implements CheckLogService {

@Resource
private CheckLogMapper checkLogMapper;

}