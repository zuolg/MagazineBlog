package com.zlg.blog.model;

import javax.persistence.*;

@Table(name = "t_metadata")
public class MetadataModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 元数据key
     */
    @Column(name = "meta_key")
    private String metaKey;

    /**
     * 元数据的对象类型
     */
    @Column(name = "object_type")
    private String objectType;

    /**
     * 元数据的对象ID
     */
    @Column(name = "object_id")
    private Long objectId;

    /**
     * 元数据value
     */
    @Column(name = "meta_value")
    private String metaValue;

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
     * 获取元数据key
     *
     * @return meta_key - 元数据key
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * 设置元数据key
     *
     * @param metaKey 元数据key
     */
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    /**
     * 获取元数据的对象类型
     *
     * @return object_type - 元数据的对象类型
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * 设置元数据的对象类型
     *
     * @param objectType 元数据的对象类型
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * 获取元数据的对象ID
     *
     * @return object_id - 元数据的对象ID
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * 设置元数据的对象ID
     *
     * @param objectId 元数据的对象ID
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    /**
     * 获取元数据value
     *
     * @return meta_value - 元数据value
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * 设置元数据value
     *
     * @param metaValue 元数据value
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }
}