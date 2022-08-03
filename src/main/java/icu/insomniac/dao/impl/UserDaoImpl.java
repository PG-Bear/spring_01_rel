package icu.insomniac.dao.impl;

import icu.insomniac.dao.UserDao;
import icu.insomniac.pojo.User;

public class UserDaoImpl implements UserDao {
    public User findByUsername(String username) {
        System.out.println("findByUsername(String username)"+": "+username);
        return null;
    }

    public User findByCondition(String username, String password) {
        System.out.println("findByCondition(String username, String password)"+": "+username+", "+password);
        return null;
    }
}
