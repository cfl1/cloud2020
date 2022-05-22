package com.chen.springcloud.domain;

import lombok.Data;

/**
 * @author chenfl
 * @create 2021-01-20-10:46
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;
}