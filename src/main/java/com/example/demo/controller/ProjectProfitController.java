package com.example.demo.controller;
import com.example.demo.controller.reponseUtil.Result;
//import com.example.demo.core.ret.Result;
//import com.example.demo.core.ret.RetResponse;
import com.example.demo.core.utils.ApplicationUtils;
import com.example.demo.model.ProjectProfit;
import com.example.demo.service.ProjectProfitService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: ProjectProfitController类
* @author SHUAIGUO
* @date 2018/09/26 11:24
*/
@RestController
@RequestMapping("/projectProfit")
public class ProjectProfitController {

@Resource
private ProjectProfitService projectProfitService;

@PostMapping("/insert")
public Result<Object> insert(ProjectProfit projectProfit) throws Exception{
projectProfit.setId(ApplicationUtils.getUUID());
    Result<Object> result = new Result<>();
    Integer state = projectProfitService.insert(projectProfit);
    return result.setData(state);
    }

    @PostMapping("/deleteById")
    public Result<Object> deleteById(@RequestParam String id) throws Exception {
         Result<Object> result = new Result<>();
        Integer state = projectProfitService.deleteById(id);
        return result.setData(state);
        }

        @PostMapping("/update")
        public Result<Object> update(ProjectProfit projectProfit) throws Exception {
            Result<Object> result = new Result<>();
            Integer state = projectProfitService.update(projectProfit);
            return result.setData(state);
            }

            @PostMapping("/selectById")
            public Result<Object> selectById(@RequestParam String id) throws Exception {
                        Result<Object> result = new Result<>();
        ProjectProfit projectProfit = projectProfitService.selectById(id);
            return result.setData(projectProfit);
            }

            /**
            * @Description: 分页查询
            * @param page 页码
            * @param size 每页条数
            * @Reutrn Result<PageInfo<ProjectProfit>>
            */
            @PostMapping("/list")
            public Result<Object> list(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) throws Exception {
            Result<Object> result = new Result<>();
            PageHelper.startPage(page, size);
            List<ProjectProfit> list = projectProfitService.selectAll();
            PageInfo<ProjectProfit> pageInfo = new PageInfo<ProjectProfit>(list);
            return result.setData(pageInfo);
            }
            }