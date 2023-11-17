package com.zhuisuyun.net.rpaparent.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName t_rpa_parameter
 */
@TableName(value ="t_rpa_parameter")
@Data
public class RpaParameter extends BaseEntity {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * t_rpa_instruction 表ID
     */
    private Integer instructId;

    /**
     * 指令名称（冗余）
     */
    private String instructName;

    /**
     * 参数序号
     */
    private Integer parameterNumber;

    /**
     * 参数名称
     */
    private String parameterName;

    /**
     * 参数描述
     */
    private String parameterDescribe;

    /**
     * 参数是否必填
     */
    private Integer isRequired;

    /**
     * 是否有默认值
     */
    private Integer isDefault;

    /**
     * 默认值
     */
    private String defaultValue;

    /**
     * 参数类型
     */
    private String parameterType;
}