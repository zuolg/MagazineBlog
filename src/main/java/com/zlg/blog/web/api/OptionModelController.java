package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.OptionModel;
import com.zlg.blog.service.OptionModelService;
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
@RequestMapping("/api/option/model")
public class OptionModelController {
    @Resource
    private OptionModelService optionModelService;

	@ApiOperation(value="add接口信息", notes="")
    @PostMapping("/add")
    public Result add(OptionModel optionModel) {
        optionModelService.save(optionModel);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="delete接口信息", notes="")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        optionModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="update接口信息", notes="")
    @PostMapping("/update")
    public Result update(OptionModel optionModel) {
        optionModelService.update(optionModel);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="detail接口信息", notes="")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        OptionModel optionModel = optionModelService.findById(id);
        return ResultGenerator.genSuccessResult(optionModel);
    }

	@ApiOperation(value="list接口信息", notes="")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<OptionModel> list = optionModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
