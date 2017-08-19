package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.ContentModel;
import com.zlg.blog.service.ContentModelService;
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
@RequestMapping("/api/content/model")
public class ContentModelController {
    @Resource
    private ContentModelService contentModelService;

	@ApiOperation(value="add接口信息", notes="")
    @PostMapping("/add")
    public Result add(ContentModel contentModel) {
        contentModelService.save(contentModel);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="delete接口信息", notes="")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        contentModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="update接口信息", notes="")
    @PostMapping("/update")
    public Result update(ContentModel contentModel) {
        contentModelService.update(contentModel);
        return ResultGenerator.genSuccessResult();
    }

	@ApiOperation(value="detail接口信息", notes="")
    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ContentModel contentModel = contentModelService.findById(id);
        return ResultGenerator.genSuccessResult(contentModel);
    }

	@ApiOperation(value="list接口信息", notes="")
    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ContentModel> list = contentModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}