package com.example.demo.controller;

import com.example.demo.controller.reponseUtil.Result;
//import com.example.demo.core.ret.Result;
//import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.utils.ApplicationUtils;
import com.example.demo.model.SystemLog;
import com.example.demo.service.SystemLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author SHUAIGUO
 * @Description: SystemLogController类
 * @date 2018/07/02 19:43
 */
@RestController
@RequestMapping("/systemLog")
public class SystemLogController {

    @Resource
    private SystemLogService systemLogService;

    @PostMapping("/insert")
    public Result<Object> insert(SystemLog systemLog) throws Exception {
        systemLog.setId(Integer.valueOf(ApplicationUtils.getUUID()));
        Result<Object> result = new Result<>();
        Integer state = systemLogService.insert(systemLog);
        return result.setData(state);
    }

    @PostMapping("/deleteById")
    public Result<Object> deleteById(@RequestParam String id) throws Exception {
        Result<Object> result = new Result<>();
        Integer state = systemLogService.deleteById(id);
        return result.setData(state);
    }

    @PostMapping("/update")
    public Result<Object> update(SystemLog systemLog) throws Exception {
        Result<Object> result = new Result<>();
        Integer state = systemLogService.update(systemLog);
        return result.setData(state);
    }

    @PostMapping("/selectById")
    public Result<Object> selectById(@RequestParam String id) throws Exception {
        Result<Object> result = new Result<>();
        SystemLog systemLog = systemLogService.selectById(id);
        return result.setData(systemLog);
    }

    /**
     * @param page 页码
     * @param size 每页条数
     * @Description: 分页查询
     * @Reutrn Result<PageInfo<SystemLog>>
     */
    @PostMapping("/list")
    public Result<Object> list(@RequestParam(defaultValue = "0") Integer page,
                               @RequestParam(defaultValue = "0") Integer size) throws Exception {
        Result<Object> result = new Result<>();
        PageHelper.startPage(page, size);
        List<SystemLog> list = systemLogService.selectAll();
        PageInfo<SystemLog> pageInfo = new PageInfo<SystemLog>(list);
        return result.setData(pageInfo);
    }
}