package com.waciao.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Waciao
 * @Date: 2020/3/27
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
@Data
public class User implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private Integer views;
}
