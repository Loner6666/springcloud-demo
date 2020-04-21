package com.example.server.provider;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
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
 * server-provider(服务提供者)
 */
@Slf4j
@EnableFeignClients //表示我可以调用其他服务，如果一个服务想要调用其他服务，则必须加上此注解
@EnableEurekaClient //允许注册到注册中心，表示我是一个服务
@MapperScan("com.example.server.provider.mapper")//扫描MyBatis的mapper.java接口包
@SpringBootApplication
public class ServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerProviderApplication.class, args);
        log.info("ServerProviderApplication 启动成功！");
    }

}
