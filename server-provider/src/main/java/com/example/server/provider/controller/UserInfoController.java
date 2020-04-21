package com.example.server.provider.controller;

import com.alibaba.fastjson.JSON;
import com.example.server.provider.bean.UserInfo;
import com.example.server.provider.common.ResultObject;
import com.example.server.provider.services.UserInfoServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description： gmall数据库中的user_info，控制器
 * @Author：GuoFeng
 * @CreateTime：2020:04:21
 */
@Slf4j
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoServices userInfoServices;

    /**
     * 查询user_info所有数据
     *
     * @return
     */
    @RequestMapping("/getUserInfo")
    public ResultObject getUserInfo() {
        try {
            log.info("查询user_info所有数据，start————>");
            List<UserInfo> userInfoList = this.userInfoServices.getUserInfo();
            log.info("查询user_info所有数据，end————>{}", JSON.toJSONString(userInfoList));
            return ResultObject.successData(userInfoList);
        } catch (Exception e) {
            log.info("查询user_info所有数据，error————>[{},{}]", e.getMessage(), e);
            e.printStackTrace();
            return ResultObject.error("系统异常！");
        }
    }

}
