package com.lxinyu.controller;

import com.lxinyu.entity.User;
import com.lxinyu.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PC-Lxinyu on 2018/8/20.
 */
@RestController
public class TestController {
    @Autowired
    private IUser user;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public User login(){
        return user.selectUser("aaa","abc");
    }
}
