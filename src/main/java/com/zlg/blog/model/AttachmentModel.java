package com.zlg.blog.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_attachment")
public class AttachmentModel {
    /**
     * ID主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 上传附件的用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 附件所属的内容ID
     */
    @Column(name = "content_id")
    private Long contentId;

    /**
     * 路径
     */
    private String path;

    /**
     * mime
     */
    @Column(name = "mime_type")
    private String mimeType;

    /**
     * 附件的后缀
     */
    private String suffix;

    /**
     * 上传时间
     */
    private Date created;

    /**
     * 标题
     */
    private String title;

    /**
     * 获取ID主键
     *
     * @return id - ID主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID主键
     *
     * @param id ID主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取上传附件的用户ID
     *
     * @return user_id - 上传附件的用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置上传附件的用户ID
     *
     * @param userId 上传附件的用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取附件所属的内容ID
     *
     * @return content_id - 附件所属的内容ID
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * 设置附件所属的内容ID
     *
     * @param contentId 附件所属的内容ID
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取路径
     *
     * @return path - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取mime
     *
     * @return mime_type - mime
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * 设置mime
     *
     * @param mimeType mime
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * 获取附件的后缀
     *
     * @return suffix - 附件的后缀
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * 设置附件的后缀
     *
     * @param suffix 附件的后缀
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 获取上传时间
     *
     * @return created - 上传时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置上传时间
     *
     * @param created 上传时间
     */
    public void setCreated(Date created) {
        this.created = created;
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
}