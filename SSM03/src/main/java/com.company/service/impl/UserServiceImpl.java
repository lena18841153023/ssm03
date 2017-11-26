package com.company.service.impl;

import com.company.dao.idao.UserDao;
import com.company.dao.pojo.User;
import com.company.dao.until.MD5Util;
import com.company.service.iservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/11/21.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(User user) {
        boolean flag=false;
        try {
            user.setPassword(MD5Util.createMD5(user.getPassword()));
            try {
                flag=userDao.login(user) !=null?true:false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean regist(User user) {
        boolean flag=false;
        try {
            user.setPassword(MD5Util.createMD5(user.getPassword()));
            flag=userDao.regist(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
         return flag;
    }
}
