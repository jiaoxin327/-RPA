package com.zhuisuyun.net.rpaparent.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 
 * @TableName t_rpa_instruction
 */
@TableName(value ="t_rpa_instruction")
@Data
public class RpaInstruction extends BaseEntity  {

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 指令名称
     */
    private String instructName;

    /**
     * 指令描述
     */
    private String instructDescribe;

    /**
     * 指令简化（客户看）
     */
    private String instructSimplify;

    /**
     * 指令说明（带参数的描述）
     */
    private String instructIllustrate;

    /**
     * 指令库（可自定义）
     */
    private String instructLibrary;

    /**
     * 指令分组（例：是否需要元素定位）
     */
    private String instructGroup;
}