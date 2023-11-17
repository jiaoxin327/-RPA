package com.zhuisuyun.net.rpaparent.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: xun.luo
 * @description: 表字段基础类
 * @date: 2023/11/16 0016 10:54
 * @since: 1.0
 */
@Data
public class BaseEntity implements Serializable {

    /**
     * 主键自增
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 状态（0 停用 1 启动）
     */
    private Integer status;

}
