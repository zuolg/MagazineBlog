package com.zlg.blog.web.api;
import com.zlg.blog.core.Result;
import com.zlg.blog.core.ResultGenerator;
import com.zlg.blog.model.UserModel;
import com.zlg.blog.service.UserModelService;
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
@RequestMapping("/api/user/model")
public class UserModelController {
    @Resource
    private UserModelService userModelService;

    @PostMapping("/add")
    public Result add(UserModel userModel) {
        userModelService.save(userModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userModelService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(UserModel userModel) {
        userModelService.update(userModel);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        UserModel userModel = userModelService.findById(id);
        return ResultGenerator.genSuccessResult(userModel);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserModel> list = userModelService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
