package com.example.server.provider.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * gmall数据库中的user_info
 */
@Data//getter、setter方法
@AllArgsConstructor//全参构造器
@NoArgsConstructor//无参构造器
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 7378789818558898771L;

    private Long id;//编号
    private String loginName;//用户名称
    private String nickName;//用户昵称
    private String passwd;//用户密码
    private String name;//用户姓名
    private String phoneNum;//手机号
    private String email;//邮箱
    private String headImg;//头像
    private String userLevel;//用户级别

}