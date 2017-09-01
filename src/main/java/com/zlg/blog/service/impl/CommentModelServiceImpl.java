package com.zlg.blog.service.impl;

import com.zlg.blog.dao.CommentModelMapper;
import com.zlg.blog.model.CommentModel;
import com.zlg.blog.service.CommentModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/09/01.
 */
@Service
@Transactional
public class CommentModelServiceImpl extends AbstractService<CommentModel> implements CommentModelService {
    @Resource
    private CommentModelMapper tCommentMapper;

}
