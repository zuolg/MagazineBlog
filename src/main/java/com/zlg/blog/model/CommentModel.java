package com.zlg.blog.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comment")
public class CommentModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 回复的评论ID
     */
    @Column(name = "parent_id")
    private Long parentId;

    /**
     * 评论的内容ID
     */
    @Column(name = "content_id")
    private Long contentId;

    /**
     * 评论的内容模型
     */
    @Column(name = "content_module")
    private String contentModule;

    /**
     * 评论的回复数量
     */
    @Column(name = "comment_count")
    private Integer commentCount;

    /**
     * 排序编号，常用语置顶等
     */
    @Column(name = "order_number")
    private Integer orderNumber;

    /**
     * 评论的用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 评论的IP地址
     */
    private String ip;

    /**
     * 评论的作者
     */
    private String author;

    /**
     * 评论的类型，默认是comment
     */
    private String type;

    /**
     * 评论的时间
     */
    private Date created;

    /**
     * 评论的slug
     */
    private String slug;

    /**
     * 评论用户的email
     */
    private String email;

    /**
     * 评论的状态
     */
    private String status;

    /**
     * “顶”的数量
     */
    @Column(name = "vote_up")
    private Integer voteUp;

    /**
     * “踩”的数量
     */
    @Column(name = "vote_down")
    private Integer voteDown;

    /**
     * 标识
     */
    private String flag;

    /**
     * 纬度
     */
    private BigDecimal lat;

    /**
     * 经度
     */
    private BigDecimal lng;

    /**
     * 评论的内容
     */
    private String text;

    /**
     * 提交评论的浏览器信息
     */
    private String agent;

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
     * 获取回复的评论ID
     *
     * @return parent_id - 回复的评论ID
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置回复的评论ID
     *
     * @param parentId 回复的评论ID
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取评论的内容ID
     *
     * @return content_id - 评论的内容ID
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * 设置评论的内容ID
     *
     * @param contentId 评论的内容ID
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取评论的内容模型
     *
     * @return content_module - 评论的内容模型
     */
    public String getContentModule() {
        return contentModule;
    }

    /**
     * 设置评论的内容模型
     *
     * @param contentModule 评论的内容模型
     */
    public void setContentModule(String contentModule) {
        this.contentModule = contentModule;
    }

    /**
     * 获取评论的回复数量
     *
     * @return comment_count - 评论的回复数量
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 设置评论的回复数量
     *
     * @param commentCount 评论的回复数量
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取排序编号，常用语置顶等
     *
     * @return order_number - 排序编号，常用语置顶等
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置排序编号，常用语置顶等
     *
     * @param orderNumber 排序编号，常用语置顶等
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取评论的用户ID
     *
     * @return user_id - 评论的用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置评论的用户ID
     *
     * @param userId 评论的用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取评论的IP地址
     *
     * @return ip - 评论的IP地址
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置评论的IP地址
     *
     * @param ip 评论的IP地址
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取评论的作者
     *
     * @return author - 评论的作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置评论的作者
     *
     * @param author 评论的作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取评论的类型，默认是comment
     *
     * @return type - 评论的类型，默认是comment
     */
    public String getType() {
        return type;
    }

    /**
     * 设置评论的类型，默认是comment
     *
     * @param type 评论的类型，默认是comment
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取评论的时间
     *
     * @return created - 评论的时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置评论的时间
     *
     * @param created 评论的时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取评论的slug
     *
     * @return slug - 评论的slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 设置评论的slug
     *
     * @param slug 评论的slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 获取评论用户的email
     *
     * @return email - 评论用户的email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置评论用户的email
     *
     * @param email 评论用户的email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取评论的状态
     *
     * @return status - 评论的状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置评论的状态
     *
     * @param status 评论的状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取“顶”的数量
     *
     * @return vote_up - “顶”的数量
     */
    public Integer getVoteUp() {
        return voteUp;
    }

    /**
     * 设置“顶”的数量
     *
     * @param voteUp “顶”的数量
     */
    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    /**
     * 获取“踩”的数量
     *
     * @return vote_down - “踩”的数量
     */
    public Integer getVoteDown() {
        return voteDown;
    }

    /**
     * 设置“踩”的数量
     *
     * @param voteDown “踩”的数量
     */
    public void setVoteDown(Integer voteDown) {
        this.voteDown = voteDown;
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
     * 获取评论的内容
     *
     * @return text - 评论的内容
     */
    public String getText() {
        return text;
    }

    /**
     * 设置评论的内容
     *
     * @param text 评论的内容
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取提交评论的浏览器信息
     *
     * @return agent - 提交评论的浏览器信息
     */
    public String getAgent() {
        return agent;
    }

    /**
     * 设置提交评论的浏览器信息
     *
     * @param agent 提交评论的浏览器信息
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }
}