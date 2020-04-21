package com.example.server.provider.mapper;

import com.example.server.provider.bean.UserInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    /**
     * 查询user_info所有数据
     *
     * @return List<UserInfo>
     */
    @Select("select * from user_info")//用注解可以直接执行简单的SQL语句
    List<UserInfo> getUserInfo();

}