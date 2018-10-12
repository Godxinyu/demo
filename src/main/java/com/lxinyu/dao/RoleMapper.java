package com.lxinyu.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by PC-Lxinyu on 2018/10/11.
 */
@Repository
public interface RoleMapper {
    public String selectRole(int id);
}
