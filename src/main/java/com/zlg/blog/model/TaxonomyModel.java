package com.zlg.blog.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_taxonomy")
public class TaxonomyModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * slug
     */
    private String slug;

    /**
     * 类型
     */
    private String type;

    /**
     * 图标
     */
    private String icon;

    /**
     * 对于的内容模型
     */
    @Column(name = "content_module")
    private String contentModule;

    /**
     * 该分类的内容数量
     */
    @Column(name = "content_count")
    private Integer contentCount;

    /**
     * 排序编码
     */
    @Column(name = "order_number")
    private Integer orderNumber;

    /**
     * 父级分类的ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 关联的对象ID
     */
    @Column(name = "object_id")
    private Long objectId;

    /**
     * 标识
     */
    private String flag;

    /**
     * 经度
     */
    private BigDecimal lat;

    /**
     * 纬度
     */
    private BigDecimal lng;

    /**
     * SEO关键字
     */
    @Column(name = "meta_keywords")
    private String metaKeywords;

    /**
     * SEO描述内容
     */
    @Column(name = "meta_description")
    private String metaDescription;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 内容描述
     */
    private String text;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取slug
     *
     * @return slug - slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 设置slug
     *
     * @param slug slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取对于的内容模型
     *
     * @return content_module - 对于的内容模型
     */
    public String getContentModule() {
        return contentModule;
    }

    /**
     * 设置对于的内容模型
     *
     * @param contentModule 对于的内容模型
     */
    public void setContentModule(String contentModule) {
        this.contentModule = contentModule;
    }

    /**
     * 获取该分类的内容数量
     *
     * @return content_count - 该分类的内容数量
     */
    public Integer getContentCount() {
        return contentCount;
    }

    /**
     * 设置该分类的内容数量
     *
     * @param contentCount 该分类的内容数量
     */
    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    /**
     * 获取排序编码
     *
     * @return order_number - 排序编码
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置排序编码
     *
     * @param orderNumber 排序编码
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取父级分类的ID
     *
     * @return parent_id - 父级分类的ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父级分类的ID
     *
     * @param parentId 父级分类的ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取关联的对象ID
     *
     * @return object_id - 关联的对象ID
     */
    public Long getObjectId() {
        return objectId;
    }

    /**
     * 设置关联的对象ID
     *
     * @param objectId 关联的对象ID
     */
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    /**
     * 获取标识
     *
     * @return flag - 标识
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置标识
     *
     * @param flag 标识
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 获取经度
     *
     * @return lat - 经度
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 设置经度
     *
     * @param lat 经度
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * 获取纬度
     *
     * @return lng - 纬度
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * 设置纬度
     *
     * @param lng 纬度
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    /**
     * 获取SEO关键字
     *
     * @return meta_keywords - SEO关键字
     */
    public String getMetaKeywords() {
        return metaKeywords;
    }

    /**
     * 设置SEO关键字
     *
     * @param metaKeywords SEO关键字
     */
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    /**
     * 获取SEO描述内容
     *
     * @return meta_description - SEO描述内容
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * 设置SEO描述内容
     *
     * @param metaDescription SEO描述内容
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    /**
     * 获取创建日期
     *
     * @return created - 创建日期
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建日期
     *
     * @param created 创建日期
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取内容描述
     *
     * @return text - 内容描述
     */
    public String getText() {
        return text;
    }

    /**
     * 设置内容描述
     *
     * @param text 内容描述
     */
    public void setText(String text) {
        this.text = text;
    }
}