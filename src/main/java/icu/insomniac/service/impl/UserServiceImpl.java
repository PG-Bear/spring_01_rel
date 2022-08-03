package icu.insomniac.service.impl;

import icu.insomniac.dao.UserDao;
import icu.insomniac.pojo.User;
import icu.insomniac.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User Login(String username, String password) {
        System.out.println("Login(String username, String password)");
        User user = userDao.findByCondition(username, password);
        return user;
    }

    public boolean CheckUsername(String username) {
        System.out.println("CheckUsername(String username)");
        User user = userDao.findByUsername(username);
        return user == null;
    }
}
