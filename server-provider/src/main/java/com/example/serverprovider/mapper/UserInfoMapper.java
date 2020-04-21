package com.example.serverprovider.mapper;

import com.example.serverprovider.bean.UserInfo;

/**
 * gmall数据库中的user_info，mapper
 */
public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

}