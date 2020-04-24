package com.example.server.caller.controller;

import com.example.server.caller.common.ResultObject;
import com.example.server.caller.feignclient.ServerProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： server-caller跨服务调用server-provider服务提供的getUserInfo接口，控制器
 * @Author：Administrator
 * @CreateTime：2020:04:22
 */
@RestController
public class UserInfoController {

    @Autowired
    private ServerProviderClient helloClient;

    @GetMapping("/hello")
    public String sayHello() {
        return helloClient.sayHello();
    }

    @RequestMapping("/getUserInfo")
    public ResultObject getUserInfo() {
        return helloClient.getUserInfo();
    }

}
