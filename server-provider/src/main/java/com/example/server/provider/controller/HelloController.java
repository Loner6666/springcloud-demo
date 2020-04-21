package com.example.server.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： 服务提供者提供打招呼的服务
 * @Author：Administrator
 * @CreateTime：2020:04:21
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello SpringCloud！";
    }

}
