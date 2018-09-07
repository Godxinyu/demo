package com.lxinyu.controller;

import com.lxinyu.entity.User;
import com.lxinyu.entity.UserRoleRelation;
import com.lxinyu.service.IUser;
import com.lxinyu.service.IUserRoleRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by PC-Lxinyu on 2018/8/20.
 */
@Controller
public class TestController {
    @Autowired
    private IUser userService;
    @Autowired
    private IUserRoleRelation userRoleRelation;
    @Autowired
    private UserRoleRelation userRole;

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    @ResponseBody
//    public User logintest(HttpServletRequest req){
//        return user.selectUser(req.getParameter("username"),req.getParameter("password"));
//    }
    public User userLogin(User userParam){
        return userService.selectUser(userParam.getUsername(),userParam.getPassword());
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/userRegister")
    public String register(User userParam){
        int userId = userService.insertUser(userParam);
        if(userId > 0){
            userRole.setUserId(userParam.getId());
            int userRoleId = userRoleRelation.insertUserRole(userRole);
            if(userRoleId > 0){
                return "用户添加成功，权限是普通用户";
            }else{
                return "用户角色关系表添加失败";
            }
        }else{
            return "用户添加失败";
        }
    }

    @RequestMapping(value = "/register")
    public String register(){return "register";}
}
