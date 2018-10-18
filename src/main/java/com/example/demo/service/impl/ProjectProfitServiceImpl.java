package com.example.demo.service.impl;

import com.example.demo.dao.ProjectProfitMapper;
import com.example.demo.model.ProjectProfit;
import com.example.demo.service.ProjectProfitService;
import com.example.demo.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: ProjectProfitService接口实现类
* @author SHUAIGUO
* @date 2018/09/26 11:24
*/
@Service
public class ProjectProfitServiceImpl extends AbstractService<ProjectProfit> implements ProjectProfitService {

@Resource
private ProjectProfitMapper projectProfitMapper;

}