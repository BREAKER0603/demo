package com.example.demo.controller;

import com.example.demo.controller.reponseUtil.Result;
//import com.example.demo.core.ret.Result;
//import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.utils.ApplicationUtils;
import com.example.demo.model.UserLabel;
import com.example.demo.service.UserLabelService;
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
 * @Description: UserLabelController类
 * @date 2018/07/02 20:02
 */
@RestController
@RequestMapping("/userLabel")
public class UserLabelController {

    @Resource
    private UserLabelService userLabelService;

    @PostMapping("/insert")
    public Result<Object> insert(UserLabel userLabel) throws Exception {
        userLabel.setId(Integer.valueOf(ApplicationUtils.getUUID()));
        Result<Object> result = new Result<>();
        Integer state = userLabelService.insert(userLabel);
        return result.setData(state);
    }

    @PostMapping("/deleteById")
    public Result<Object> deleteById(@RequestParam String id) throws Exception {
        Result<Object> result = new Result<>();
        Integer state = userLabelService.deleteById(id);
        return result.setData(state);
    }

    @PostMapping("/update")
    public Result<Object> update(UserLabel userLabel) throws Exception {
        Result<Object> result = new Result<>();
        Integer state = userLabelService.update(userLabel);
        return result.setData(state);
    }

    @PostMapping("/selectById")
    public Result<Object> selectById(@RequestParam String id) throws Exception {
        Result<Object> result = new Result<>();
        UserLabel userLabel = userLabelService.selectById(id);
        return result.setData(userLabel);
    }

    /**
     * @param page 页码
     * @param size 每页条数
     * @Description: 分页查询
     * @Reutrn Result<PageInfo<UserLabel>>
     */
    @PostMapping("/list")
    public Result<Object> list(@RequestParam(defaultValue = "0") Integer page,
                               @RequestParam(defaultValue = "0") Integer size) throws Exception {
        Result<Object> result = new Result<>();
        PageHelper.startPage(page, size);
        List<UserLabel> list = userLabelService.selectAll();
        PageInfo<UserLabel> pageInfo = new PageInfo<UserLabel>(list);
        return result.setData(pageInfo);
    }
}