package com.zlg.blog.service.impl;

import com.zlg.blog.dao.MetadataModelMapper;
import com.zlg.blog.model.MetadataModel;
import com.zlg.blog.service.MetadataModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/09/01.
 */
@Service
@Transactional
public class MetadataModelServiceImpl extends AbstractService<MetadataModel> implements MetadataModelService {
    @Resource
    private MetadataModelMapper tMetadataMapper;

}
