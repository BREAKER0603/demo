package com.example.demo.controller;

import com.example.demo.controller.reponseUtil.Result;
import com.example.demo.service.RedisService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:SHIGS
 * @Description
 * @Date Created in 16:36 2018/7/3
 * @modified By
 */
@RestController
@RequestMapping("/redisTest")
public class RedisController {
    @Resource
    private RedisService redisService;

    @PostMapping(value = "/setRedis")
    public Result<Object> setRedis(@RequestParam String name) {
        redisService.set("name2",name);
        return new Result<>().setData(name);
    }

    @PostMapping("/getName")
    public Result<Object> getRedis(@RequestParam String name2) {
        Result<Object> result = new Result<>();
        String name = redisService.get(name2);
        return result.setData(name);
    }
}
