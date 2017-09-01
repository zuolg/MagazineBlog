package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.TaxonomyModel;
import com.zlg.blog.service.TaxonomyModelService;
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
@RequestMapping("/api/taxonomy/model")
public class TaxonomyModelController {
    @Resource
    private TaxonomyModelService taxonomyModelService;

    @PostMapping("/add")
    public Result add(TaxonomyModel taxonomyModel) {
        taxonomyModelService.save(taxonomyModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        taxonomyModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TaxonomyModel taxonomyModel) {
        taxonomyModelService.update(taxonomyModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TaxonomyModel taxonomyModel = taxonomyModelService.findById(id);
        return ResultGenerator.genSuccessResult(taxonomyModel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TaxonomyModel> list = taxonomyModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
