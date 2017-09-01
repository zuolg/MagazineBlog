package com.zlg.blog.service.impl;

import com.zlg.blog.dao.ContentModelMapper;
import com.zlg.blog.model.ContentModel;
import com.zlg.blog.service.ContentModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/09/01.
 */
@Service
@Transactional
public class ContentModelServiceImpl extends AbstractService<ContentModel> implements ContentModelService {
    @Resource
    private ContentModelMapper tContentMapper;

}
