package com.example.server.caller;

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
@EnableEurekaClient//向注册中心注册，表示我是一个服务
@EnableFeignClients//表示我可以调用其他服务，如果一个服务想要调用其他服务，则必须加上此注解
@SpringBootApplication
public class ServerCallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerCallerApplication.class, args);
        log.info("ServerCallerApplication 启动成功！");
    }

}
