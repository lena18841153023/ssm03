package com.company.dao.idao;

import com.company.dao.pojo.User;

/**
 * Created by Administrator on 2017/11/21.
 */
public interface UserDao {
    //登录
    User login(User user) throws Exception;
    //注册
    boolean regist(User user)throws Exception;
}
