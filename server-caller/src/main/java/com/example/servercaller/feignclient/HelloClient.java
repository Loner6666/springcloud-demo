package com.example.servercaller.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description： 调用server-provider的SayHello类的方法
 * 调用者的接口方法是被调用者方法的声明，映射路径与被调用者方法的映射路径相同
 * @Author：Administrator
 * @CreateTime：2020:04:21
 */
@FeignClient(value = "server-provider") //调用的服务名称
public interface HelloClient {

    @GetMapping("/hello")
    public String sayHello();

}
