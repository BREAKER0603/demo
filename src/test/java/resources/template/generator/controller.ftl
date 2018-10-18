package ${basePackageController};
import com.example.demo.controller.reponseUtil.Result;
//import ${basePackage}.core.ret.Result;
//import ${basePackage}.core.ret.RetResponse;
import ${basePackage}.core.utils.ApplicationUtils;
import ${basePackageModel}.${modelNameUpperCamel};
import ${basePackageService}.${modelNameUpperCamel}Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* @Description: ${modelNameUpperCamel}Controller类
* @author ${author}
* @date ${date}
*/
@RestController
@RequestMapping("/${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller {

@Resource
private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

@PostMapping("/insert")
public Result<Object> insert(${modelNameUpperCamel} ${modelNameLowerCamel}) throws Exception{
${modelNameLowerCamel}.setId(ApplicationUtils.getUUID());
    Result<Object> result = new Result<>();
    Integer state = ${modelNameLowerCamel}Service.insert(${modelNameLowerCamel});
    return result.setData(state);
    }

    @PostMapping("/deleteById")
    public Result<Object> deleteById(@RequestParam String id) throws Exception {
         Result<Object> result = new Result<>();
        Integer state = ${modelNameLowerCamel}Service.deleteById(id);
        return result.setData(state);
        }

        @PostMapping("/update")
        public Result<Object> update(${modelNameUpperCamel} ${modelNameLowerCamel}) throws Exception {
            Result<Object> result = new Result<>();
            Integer state = ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
            return result.setData(state);
            }

            @PostMapping("/selectById")
            public Result<Object> selectById(@RequestParam String id) throws Exception {
                        Result<Object> result = new Result<>();
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.selectById(id);
            return result.setData(${modelNameLowerCamel});
            }

            /**
            * @Description: 分页查询
            * @param page 页码
            * @param size 每页条数
            * @Reutrn Result<PageInfo<${modelNameUpperCamel}>>
            */
            @PostMapping("/list")
            public Result<Object> list(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "0") Integer size) throws Exception {
            Result<Object> result = new Result<>();
            PageHelper.startPage(page, size);
            List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.selectAll();
            PageInfo<${modelNameUpperCamel}> pageInfo = new PageInfo<${modelNameUpperCamel}>(list);
            return result.setData(pageInfo);
            }
            }