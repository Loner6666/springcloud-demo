package com.example.serverprovider.services;

import com.example.serverprovider.bean.UserInfo;

import java.util.List;

/**
 * @Description： gmall数据库中的user_info，接口
 * @Author：GuoFeng
 * @CreateTime：2020:04:21
 */
public interface UserInfoServices {

    /**
     * 查询user_info所有数据
     *
     * @return List<UserInfo>
     * @throws Exception
     */
    List<UserInfo> getUserInfo() throws Exception;

}
