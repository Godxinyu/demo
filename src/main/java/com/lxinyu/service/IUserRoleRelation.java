package com.lxinyu.service;

import com.lxinyu.entity.UserRoleRelation;
import org.springframework.stereotype.Service;

/**
 * Created by PC-Lxinyu on 2018/9/6.
 */
public interface IUserRoleRelation {
    public int insertUserRole(UserRoleRelation userRoleRelation);
    public int selectUserRole(int userId);
}
