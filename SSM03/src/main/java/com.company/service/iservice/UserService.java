package com.company.service.iservice;

import com.company.dao.pojo.User;

/**
 * Created by Administrator on 2017/11/21.
 */
public interface UserService {
    //登陆
    boolean login(User user);
    //注册
    boolean regist(User user);

}
