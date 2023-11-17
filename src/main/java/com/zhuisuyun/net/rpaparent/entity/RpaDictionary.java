package com.zhuisuyun.net.rpaparent.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName 字典表
 */
@TableName(value ="t_rpa_dictionary")
@Data
public class RpaDictionary extends BaseEntity {


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 关联主键
     */
    private Integer linkId;

    /**
     * 值
     */
    private String value;

    /**
     * 说明
     */
    private String text;
}