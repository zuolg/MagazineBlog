package com.zlg.blog.service.impl;

import com.zlg.blog.dao.TaxonomyModelMapper;
import com.zlg.blog.model.TaxonomyModel;
import com.zlg.blog.service.TaxonomyModelService;
import com.zlg.blog.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by ZuoLG on 2017/09/01.
 */
@Service
@Transactional
public class TaxonomyModelServiceImpl extends AbstractService<TaxonomyModel> implements TaxonomyModelService {
    @Resource
    private TaxonomyModelMapper tTaxonomyMapper;

}
