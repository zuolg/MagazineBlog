package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.AttachmentModel;
import com.zlg.blog.service.AttachmentModelService;
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
@RequestMapping("/api/attachment/model")
public class AttachmentModelController {
    @Resource
    private AttachmentModelService attachmentModelService;

    @PostMapping("/add")
    public Result add(AttachmentModel attachmentModel) {
        attachmentModelService.save(attachmentModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        attachmentModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(AttachmentModel attachmentModel) {
        attachmentModelService.update(attachmentModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        AttachmentModel attachmentModel = attachmentModelService.findById(id);
        return ResultGenerator.genSuccessResult(attachmentModel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<AttachmentModel> list = attachmentModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
