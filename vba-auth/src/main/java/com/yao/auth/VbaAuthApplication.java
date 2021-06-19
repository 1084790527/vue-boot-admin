package com.yao.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 * @author 妖妖
 * @date 20:02 2021/6/17
 */

//@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class VbaAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(VbaAuthApplication.class, args);
    }
}
