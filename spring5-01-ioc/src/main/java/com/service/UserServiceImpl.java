package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

/**
 * @author: Waciao
 * @Date: 2020/3/24
 * @Version: 1.0
 * @github: https://github.com/byojiaoxianz7
 */
public class UserServiceImpl implements UserService {

//    private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    /**
     * 利用set进行动态实现值的注入！
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
