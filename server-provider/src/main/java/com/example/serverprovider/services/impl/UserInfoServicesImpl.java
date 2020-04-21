package com.example.serverprovider.services.impl;

import com.example.serverprovider.bean.UserInfo;
import com.example.serverprovider.mapper.UserInfoMapper;
import com.example.serverprovider.services.UserInfoServices;
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
