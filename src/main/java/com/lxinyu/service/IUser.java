package com.lxinyu.service;

import com.lxinyu.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PC-Lxinyu on 2018/8/20.
 */
public interface IUser {
    public User selectUser(String username, String password);

    public List<User> showUsers();

    public int insertUser(User user);

    public int updateUser(User user);

    public int deleteUser(String username, String password);
}
