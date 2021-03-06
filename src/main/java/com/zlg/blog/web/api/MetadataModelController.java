package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.MetadataModel;
import com.zlg.blog.service.MetadataModelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ZuoLG on 2017/09/01.
*/
@RestController
@RequestMapping("/api/metadata/model")
public class MetadataModelController {
    @Resource
    private MetadataModelService metadataModelService;

    @PostMapping("/add")
    public Result add(MetadataModel metadataModel) {
        metadataModelService.save(metadataModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        metadataModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(MetadataModel metadataModel) {
        metadataModelService.update(metadataModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        MetadataModel metadataModel = metadataModelService.findById(id);
        return ResultGenerator.genSuccessResult(metadataModel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MetadataModel> list = metadataModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
