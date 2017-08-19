package com.zlg.blog.service.impl;

import com.zlg.blog.dao.OptionModelMapper;
import com.zlg.blog.model.OptionModel;
import com.zlg.blog.service.OptionModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/08/19.
 */
@Service
@Transactional
public class OptionModelServiceImpl extends AbstractService<OptionModel> implements OptionModelService {
    @Resource
    private OptionModelMapper tOptionMapper;

}
