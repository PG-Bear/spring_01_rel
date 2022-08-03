package icu.insomniac.service.impl;

import icu.insomniac.dao.UserDao;
import icu.insomniac.pojo.User;
import icu.insomniac.service.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public User Login(String username, String password) {
        System.out.println("Login(String username, String password)"+": "+username+", "+password);
        User user = userDao.findByCondition(username, password);
        return user;
    }

    public boolean CheckUsername(String username) {
        System.out.println("CheckUsername(String username)"+": "+username);
        User user = userDao.findByUsername(username);
        return user == null;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userDao=" + userDao +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
