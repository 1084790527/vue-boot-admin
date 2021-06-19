package com.yao.visual.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author 妖妖
 * @date 19:34 2021/6/17
 */

@EnableAdminServer
@SpringCloudApplication
public class VbaMonitorApplication {
    public static void main(String[] args){
        SpringApplication.run(VbaMonitorApplication.class, args);
    }
}
