package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.MappingModel;
import com.zlg.blog.service.MappingModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.ApiOperation;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ZuoLG on 2017/08/19.
*/
@RestController
@RequestMapping("/api/mapping/model")
public class MappingModelController {
    @Resource
    private MappingModelService mappingModelService;

	@ApiOperation(value="add接口信息", notes="")
    @PostMapping("/add")
    public Result add(MappingModel mappingModel) {
        mappingModelService.save(mappingModel);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="delete接口信息", notes="")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        mappingModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="update接口信息", notes="")
    @PostMapping("/update")
    public Result update(MappingModel mappingModel) {
        mappingModelService.update(mappingModel);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="detail接口信息", notes="")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        MappingModel mappingModel = mappingModelService.findById(id);
        return ResultGenerator.genSuccessResult(mappingModel);
    }

	@ApiOperation(value="list接口信息", notes="")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MappingModel> list = mappingModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
