package icu.insomniac.service;

import icu.insomniac.pojo.User;

public interface UserService {
    User Login(String username, String password);
    boolean CheckUsername(String username);
}
