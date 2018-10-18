package com.example.demo.controller;

import com.example.demo.controller.reponseUtil.Result;
import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 21:39 2018/5/29
 * @modified By
 */
@RestController
@RequestMapping(value = "userInfo")
@Api(tags = {"用户操作接口"}, description = "userInfoContorller")
public class UserInfoContorller {
    @Autowired
    private UserInfoService userInfoService;

    @PostMapping(value = "hello")
    public String hello() {
        return "hello Spring Boot";
    }

    @PostMapping("/testException")
    public Result<UserInfo> testException(Integer id) {
        List a = null;
        a.size();
        UserInfo userInfo = userInfoService.selectById(id);
        return new Result<>(userInfo);
    }

    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true,
                    dataType = "Integer", paramType = "query")
    })
    @PostMapping(value = "selectById")
    public Result<Object> selectById(@RequestParam Integer id) {
        Result<Object> result = new Result<>();
        UserInfo userInfo = userInfoService.selectById(id);
        return result.setData(userInfo);
    }

    @ApiOperation(value = "查询用户", notes = "分页查询用户所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页码",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示条数",
                    dataType = "Integer", paramType = "query")
    })
    @PostMapping(value = "/selectAll")
    public Result<Object> selectAll(@RequestParam(defaultValue = "0") Integer page,@RequestParam(defaultValue = "0") Integer size) {
        Result<Object> result = new Result<>();
        PageInfo<UserInfo> pageInfo = userInfoService.selectAll(page, size);
        return result.setData(pageInfo);
    }
}
