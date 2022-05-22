package com.chen.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenfl
 * @create 2021-01-20-10:57
 */
@Configuration
@MapperScan({"com.chen.springcloud.dao"})
public class MyBatisConfig {

}
