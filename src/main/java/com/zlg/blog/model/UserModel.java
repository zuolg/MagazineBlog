package com.zlg.blog.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class UserModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登陆名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 实名
     */
    private String realname;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 邮件
     */
    private String email;

    /**
     * 邮箱状态（是否认证等）
     */
    @Column(name = "email_status")
    private String emailStatus;

    /**
     * 手机电话
     */
    private String mobile;

    /**
     * 手机状态（是否认证等）
     */
    @Column(name = "mobile_status")
    private String mobileStatus;

    /**
     * 固定电话
     */
    private String telephone;

    /**
     * 金额（余额）
     */
    private BigDecimal amount;

    /**
     * 性别
     */
    private String gender;

    /**
     * 权限
     */
    private String role;

    /**
     * 签名
     */
    private String signature;

    /**
     * 内容数量
     */
    @Column(name = "content_count")
    private Integer contentCount;

    /**
     * 评论数量
     */
    @Column(name = "comment_count")
    private Integer commentCount;

    /**
     * QQ号码
     */
    private String qq;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 微博
     */
    private String weibo;

    private String facebook;

    private String linkedin;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 公司
     */
    private String company;

    /**
     * 职位、职业
     */
    private String occupation;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮政编码
     */
    private String zipcode;

    /**
     * 个人网址
     */
    private String site;

    /**
     * 毕业学校
     */
    private String graduateschool;

    /**
     * 学历
     */
    private String education;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 证件类型：身份证 护照 军官证等
     */
    private String idcardtype;

    /**
     * 证件号码
     */
    private String idcard;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 用户来源（可能来之oauth第三方）
     */
    @Column(name = "create_source")
    private String createSource;

    /**
     * 最后的登陆时间
     */
    private Date logged;

    /**
     * 激活时间
     */
    private Date activated;

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
     * 获取登陆名
     *
     * @return username - 登陆名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置登陆名
     *
     * @param username 登陆名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取实名
     *
     * @return realname - 实名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置实名
     *
     * @param realname 实名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐
     *
     * @return salt - 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐
     *
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取邮件
     *
     * @return email - 邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮件
     *
     * @param email 邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取邮箱状态（是否认证等）
     *
     * @return email_status - 邮箱状态（是否认证等）
     */
    public String getEmailStatus() {
        return emailStatus;
    }

    /**
     * 设置邮箱状态（是否认证等）
     *
     * @param emailStatus 邮箱状态（是否认证等）
     */
    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    /**
     * 获取手机电话
     *
     * @return mobile - 手机电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机电话
     *
     * @param mobile 手机电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取手机状态（是否认证等）
     *
     * @return mobile_status - 手机状态（是否认证等）
     */
    public String getMobileStatus() {
        return mobileStatus;
    }

    /**
     * 设置手机状态（是否认证等）
     *
     * @param mobileStatus 手机状态（是否认证等）
     */
    public void setMobileStatus(String mobileStatus) {
        this.mobileStatus = mobileStatus;
    }

    /**
     * 获取固定电话
     *
     * @return telephone - 固定电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置固定电话
     *
     * @param telephone 固定电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取金额（余额）
     *
     * @return amount - 金额（余额）
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额（余额）
     *
     * @param amount 金额（余额）
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取权限
     *
     * @return role - 权限
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置权限
     *
     * @param role 权限
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取签名
     *
     * @return signature - 签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置签名
     *
     * @param signature 签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取内容数量
     *
     * @return content_count - 内容数量
     */
    public Integer getContentCount() {
        return contentCount;
    }

    /**
     * 设置内容数量
     *
     * @param contentCount 内容数量
     */
    public void setContentCount(Integer contentCount) {
        this.contentCount = contentCount;
    }

    /**
     * 获取评论数量
     *
     * @return comment_count - 评论数量
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 设置评论数量
     *
     * @param commentCount 评论数量
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取QQ号码
     *
     * @return qq - QQ号码
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ号码
     *
     * @param qq QQ号码
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微信号
     *
     * @return wechat - 微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信号
     *
     * @param wechat 微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取微博
     *
     * @return weibo - 微博
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * 设置微博
     *
     * @param weibo 微博
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    /**
     * @return facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return linkedin
     */
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * @param linkedin
     */
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取公司
     *
     * @return company - 公司
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司
     *
     * @param company 公司
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 获取职位、职业
     *
     * @return occupation - 职位、职业
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * 设置职位、职业
     *
     * @param occupation 职位、职业
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮政编码
     *
     * @return zipcode - 邮政编码
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 设置邮政编码
     *
     * @param zipcode 邮政编码
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 获取个人网址
     *
     * @return site - 个人网址
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置个人网址
     *
     * @param site 个人网址
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取毕业学校
     *
     * @return graduateschool - 毕业学校
     */
    public String getGraduateschool() {
        return graduateschool;
    }

    /**
     * 设置毕业学校
     *
     * @param graduateschool 毕业学校
     */
    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool;
    }

    /**
     * 获取学历
     *
     * @return education - 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置学历
     *
     * @param education 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取证件类型：身份证 护照 军官证等
     *
     * @return idcardtype - 证件类型：身份证 护照 军官证等
     */
    public String getIdcardtype() {
        return idcardtype;
    }

    /**
     * 设置证件类型：身份证 护照 军官证等
     *
     * @param idcardtype 证件类型：身份证 护照 军官证等
     */
    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    /**
     * 获取证件号码
     *
     * @return idcard - 证件号码
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置证件号码
     *
     * @param idcard 证件号码
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
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
     * 获取用户来源（可能来之oauth第三方）
     *
     * @return create_source - 用户来源（可能来之oauth第三方）
     */
    public String getCreateSource() {
        return createSource;
    }

    /**
     * 设置用户来源（可能来之oauth第三方）
     *
     * @param createSource 用户来源（可能来之oauth第三方）
     */
    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    /**
     * 获取最后的登陆时间
     *
     * @return logged - 最后的登陆时间
     */
    public Date getLogged() {
        return logged;
    }

    /**
     * 设置最后的登陆时间
     *
     * @param logged 最后的登陆时间
     */
    public void setLogged(Date logged) {
        this.logged = logged;
    }

    /**
     * 获取激活时间
     *
     * @return activated - 激活时间
     */
    public Date getActivated() {
        return activated;
    }

    /**
     * 设置激活时间
     *
     * @param activated 激活时间
     */
    public void setActivated(Date activated) {
        this.activated = activated;
    }
}