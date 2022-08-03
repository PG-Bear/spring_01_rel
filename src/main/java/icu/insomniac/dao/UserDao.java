package icu.insomniac.dao;

import icu.insomniac.pojo.User;

public interface UserDao {
    User findByUsername(String username);
    User findByCondition(String username, String password);
}
