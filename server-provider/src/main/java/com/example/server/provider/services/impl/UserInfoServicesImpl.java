package com.example.server.provider.services.impl;

import com.example.server.provider.bean.UserInfo;
import com.example.server.provider.mapper.UserInfoMapper;
import com.example.server.provider.services.UserInfoServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description： gmall数据库中的user_info，实现类
 * @Author：GuoFeng
 * @CreateTime：2020:04:21
 */
@Slf4j
@Service
public class UserInfoServicesImpl implements UserInfoServices {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 查询user_info所有数据
     *
     * @return userInfo
     * @throws Exception
     */
    @Override
    public List<UserInfo> getUserInfo() throws Exception {
        List<UserInfo> userInfo = this.userInfoMapper.getUserInfo();
        return userInfo;
    }

}
