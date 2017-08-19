package com.zlg.blog.model;

import javax.persistence.*;

@Table(name = "t_mapping")
public class MappingModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 内容ID
     */
    @Column(name = "content_id")
    private Long contentId;

    /**
     * 分类ID
     */
    @Column(name = "taxonomy_id")
    private Long taxonomyId;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取内容ID
     *
     * @return content_id - 内容ID
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * 设置内容ID
     *
     * @param contentId 内容ID
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取分类ID
     *
     * @return taxonomy_id - 分类ID
     */
    public Long getTaxonomyId() {
        return taxonomyId;
    }

    /**
     * 设置分类ID
     *
     * @param taxonomyId 分类ID
     */
    public void setTaxonomyId(Long taxonomyId) {
        this.taxonomyId = taxonomyId;
    }
}