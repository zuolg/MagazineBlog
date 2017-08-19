package com.zlg.blog.model;

import javax.persistence.*;

@Table(name = "t_option")
public class OptionModel {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 配置KEY
     */
    @Column(name = "option_key")
    private String optionKey;

    /**
     * 配置内容
     */
    @Column(name = "option_value")
    private String optionValue;

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
     * 获取配置KEY
     *
     * @return option_key - 配置KEY
     */
    public String getOptionKey() {
        return optionKey;
    }

    /**
     * 设置配置KEY
     *
     * @param optionKey 配置KEY
     */
    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    /**
     * 获取配置内容
     *
     * @return option_value - 配置内容
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * 设置配置内容
     *
     * @param optionValue 配置内容
     */
    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }
}