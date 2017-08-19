package com.zlg.blog.service.impl;

import com.zlg.blog.dao.MappingModelMapper;
import com.zlg.blog.model.MappingModel;
import com.zlg.blog.service.MappingModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/08/19.
 */
@Service
@Transactional
public class MappingModelServiceImpl extends AbstractService<MappingModel> implements MappingModelService {
    @Resource
    private MappingModelMapper tMappingMapper;

}
