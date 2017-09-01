package com.zlg.blog.service.impl;

import com.zlg.blog.dao.AttachmentModelMapper;
import com.zlg.blog.model.AttachmentModel;
import com.zlg.blog.service.AttachmentModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/09/01.
 */
@Service
@Transactional
public class AttachmentModelServiceImpl extends AbstractService<AttachmentModel> implements AttachmentModelService {
    @Resource
    private AttachmentModelMapper tAttachmentMapper;

}
