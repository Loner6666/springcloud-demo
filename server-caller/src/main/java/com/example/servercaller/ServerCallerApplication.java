package com.example.servercaller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * SpringCloud中discovery service有许多种实现（eureka、consul、zookeeper等等），
 *
 * @EnableDiscoveryClient基于spring-cloud-commons,
 * @EnableEurekaClient基于spring-cloud-netflix。 <p>
 * <p>
 * 其实用更简单的话来说，就是如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient；
 * <p>
 * 如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 */

/**
 * server-caller（服务调用者）
 */
@Slf4j
@EnableFeignClients //允许服务调用
@EnableEurekaClient //允许注册到注册中心
@SpringBootApplication
public class ServerCallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerCallerApplication.class, args);
        log.info("ServerCallerApplication 启动成功！");
    }

}
