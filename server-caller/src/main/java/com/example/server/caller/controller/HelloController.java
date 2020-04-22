package com.example.server.caller.controller;

import com.example.server.caller.feignclient.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： 服务调用者调用打招呼的服务
 * @Author：Administrator
 * @CreateTime：2020:04:22
 */
@RestController
public class HelloController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("/hello")
    public String sayHello() {
        return helloClient.sayHello();
    }
}
