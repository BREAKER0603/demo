package com.example.demo.controller;
import com.example.demo.controller.reponseUtil.Result;
import com.example.demo.model.CheckLog;
import com.example.demo.service.CheckLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//import com.example.demo.core.ret.Result;
//import com.example.demo.core.ret.RetResponse;

/**
* @Description: CheckLogController类
* @author SHUAIGUO
* @date 2018/08/27 15:43
*/
@RestController
@RequestMapping("/checkLog")
public class CheckLogController {

@Resource
private CheckLogService checkLogService;

@PostMapping("/insert")
public Result<Object> insert(CheckLog checkLog) throws Exception{
    Result<Object> result = new Result<>();
    Integer state = checkLogService.insert(checkLog);
    return result.setData(state);
    }

    @PostMapping("/deleteById")
    public Result<Object> deleteById(@RequestParam String id) throws Exception {
         Result<Object> result = new Result<>();
        Integer state = checkLogService.deleteById(id);
        return result.setData(state);
        }

        @PostMapping("/update")
        public Result<Object> update(CheckLog checkLog) throws Exception {
            Result<Object> result = new Result<>();
            Integer state = checkLogService.update(checkLog);
            return result.setData(state);
            }

            @PostMapping("/selectById")
            public Result<Object> selectById(@RequestParam String id) throws Exception {
                        Result<Object> result = new Result<>();
        CheckLog checkLog = checkLogService.selectById(id);
            return result.setData(checkLog);
            }

            /**
            * @Description: 分页查询
            * @param page 页码
            * @param size 每页条数
            * @Reutrn Result<PageInfo<CheckLog>>
            */
            @PostMapping("/list")
            public Result<Object> list(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) throws Exception {
            Result<Object> result = new Result<>();
            PageHelper.startPage(page, size);
            List<CheckLog> list = checkLogService.selectAll();
            PageInfo<CheckLog> pageInfo = new PageInfo<CheckLog>(list);
            return result.setData(pageInfo);
            }
            }