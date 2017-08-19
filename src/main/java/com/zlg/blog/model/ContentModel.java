package com.zlg.blog.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_content")
public class ContentModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 连接到(常用于谋文章只是一个连接)
     */
    @Column(name = "link_to")
    private String linkTo;

    /**
     * 是否启用markdown
     */
    @Column(name = "markdown_enable")
    private Boolean markdownEnable;

    /**
     * 缩略图
     */
    private String thumbnail;

    /**
     * 模型
     */
    private String module;

    /**
     * 样式
     */
    private String style;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 匿名稿的用户
     */
    private String author;

    /**
     * 匿名稿的邮箱
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * IP地址
     */
    @Column(name = "user_ip")
    private String userIp;

    /**
     * 父级内容ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 关联的对象ID
     */
    @Column(name = "object_id")
    private Long objectId;

    /**
     * 排序编号
     */
    @Column(name = "order_number")
    private Integer orderNumber;

    /**
     * 状态
     */
    private String status;

    /**
     * 支持人数
     */
    @Column(name = "vote_up")
    private Integer voteUp;

    /**
     * 反对人数
     */
    @Column(name = "vote_down")
    private Integer voteDown;

    /**
     * 评分分数
     */
    private Integer rate;

    /**
     * 评分次数
     */
    @Column(name = "rate_count")
    private Integer rateCount;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 评论状态
     */
    @Column(name = "comment_status")
    private String commentStatus;

    /**
     * 评论总数
     */
    @Column(name = "comment_count")
    private Integer commentCount;

    /**
     * 最后评论时间
     */
    @Column(name = "comment_time")
    private Date commentTime;

    /**
     * 访问量
     */
    @Column(name = "view_count")
    private Integer viewCount;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 最后更新日期
     */
    private Date modified;

    /**
     * slug
     */
    private String slug;

    /**
     * 标识
     */
    private String flag;

    /**
     * 经度
     */
    private BigDecimal lng;

    /**
     * 纬度
     */
    private BigDecimal lat;

    /**
     * SEO关键字
     */
    @Column(name = "meta_keywords")
    private String metaKeywords;

    /**
     * SEO描述信息
     */
    @Column(name = "meta_description")
    private String metaDescription;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String text;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 发布浏览agent
     */
    @Column(name = "user_agent")
    private String userAgent;

    /**
     * 备注信息
     */
    private String remarks;

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
     * 获取连接到(常用于谋文章只是一个连接)
     *
     * @return link_to - 连接到(常用于谋文章只是一个连接)
     */
    public String getLinkTo() {
        return linkTo;
    }

    /**
     * 设置连接到(常用于谋文章只是一个连接)
     *
     * @param linkTo 连接到(常用于谋文章只是一个连接)
     */
    public void setLinkTo(String linkTo) {
        this.linkTo = linkTo;
    }

    /**
     * 获取是否启用markdown
     *
     * @return markdown_enable - 是否启用markdown
     */
    public Boolean getMarkdownEnable() {
        return markdownEnable;
    }

    /**
     * 设置是否启用markdown
     *
     * @param markdownEnable 是否启用markdown
     */
    public void setMarkdownEnable(Boolean markdownEnable) {
        this.markdownEnable = markdownEnable;
    }

    /**
     * 获取缩略图
     *
     * @return thumbnail - 缩略图
     */
    public String getThumbnail() {
        return thumbnail;
    }

    /**
     * 设置缩略图
     *
     * @param thumbnail 缩略图
     */
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * 获取模型
     *
     * @return module - 模型
     */
    public String getModule() {
        return module;
    }

    /**
     * 设置模型
     *
     * @param module 模型
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * 获取样式
     *
     * @return style - 样式
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置样式
     *
     * @param style 样式
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取匿名稿的用户
     *
     * @return author - 匿名稿的用户
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置匿名稿的用户
     *
     * @param author 匿名稿的用户
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取匿名稿的邮箱
     *
     * @return user_email - 匿名稿的邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置匿名稿的邮箱
     *
     * @param userEmail 匿名稿的邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取IP地址
     *
     * @return user_ip - IP地址
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * 设置IP地址
     *
     * @param userIp IP地址
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    /**
     * 获取父级内容ID
     *
     * @return parent_id - 父级内容ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父级内容ID
     *
     * @param parentId 父级内容ID
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
     * 获取排序编号
     *
     * @return order_number - 排序编号
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置排序编号
     *
     * @param orderNumber 排序编号
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取支持人数
     *
     * @return vote_up - 支持人数
     */
    public Integer getVoteUp() {
        return voteUp;
    }

    /**
     * 设置支持人数
     *
     * @param voteUp 支持人数
     */
    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    /**
     * 获取反对人数
     *
     * @return vote_down - 反对人数
     */
    public Integer getVoteDown() {
        return voteDown;
    }

    /**
     * 设置反对人数
     *
     * @param voteDown 反对人数
     */
    public void setVoteDown(Integer voteDown) {
        this.voteDown = voteDown;
    }

    /**
     * 获取评分分数
     *
     * @return rate - 评分分数
     */
    public Integer getRate() {
        return rate;
    }

    /**
     * 设置评分分数
     *
     * @param rate 评分分数
     */
    public void setRate(Integer rate) {
        this.rate = rate;
    }

    /**
     * 获取评分次数
     *
     * @return rate_count - 评分次数
     */
    public Integer getRateCount() {
        return rateCount;
    }

    /**
     * 设置评分次数
     *
     * @param rateCount 评分次数
     */
    public void setRateCount(Integer rateCount) {
        this.rateCount = rateCount;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取评论状态
     *
     * @return comment_status - 评论状态
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * 设置评论状态
     *
     * @param commentStatus 评论状态
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * 获取评论总数
     *
     * @return comment_count - 评论总数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 设置评论总数
     *
     * @param commentCount 评论总数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取最后评论时间
     *
     * @return comment_time - 最后评论时间
     */
    public Date getCommentTime() {
        return commentTime;
    }

    /**
     * 设置最后评论时间
     *
     * @param commentTime 最后评论时间
     */
    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * 获取访问量
     *
     * @return view_count - 访问量
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * 设置访问量
     *
     * @param viewCount 访问量
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
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
     * 获取最后更新日期
     *
     * @return modified - 最后更新日期
     */
    public Date getModified() {
        return modified;
    }

    /**
     * 设置最后更新日期
     *
     * @param modified 最后更新日期
     */
    public void setModified(Date modified) {
        this.modified = modified;
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
     * @return lng - 经度
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    /**
     * 获取纬度
     *
     * @return lat - 纬度
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
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
     * 获取SEO描述信息
     *
     * @return meta_description - SEO描述信息
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * 设置SEO描述信息
     *
     * @param metaDescription SEO描述信息
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
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
     * 获取内容
     *
     * @return text - 内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置内容
     *
     * @param text 内容
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取摘要
     *
     * @return summary - 摘要
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 设置摘要
     *
     * @param summary 摘要
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 获取发布浏览agent
     *
     * @return user_agent - 发布浏览agent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * 设置发布浏览agent
     *
     * @param userAgent 发布浏览agent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}