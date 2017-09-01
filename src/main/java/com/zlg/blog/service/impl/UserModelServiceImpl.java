package com.zlg.blog.service.impl;

import com.zlg.blog.dao.UserModelMapper;
import com.zlg.blog.model.UserModel;
import com.zlg.blog.service.UserModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/09/01.
 */
@Service
@Transactional
public class UserModelServiceImpl extends AbstractService<UserModel> implements UserModelService {
    @Resource
    private UserModelMapper tUserMapper;

}
