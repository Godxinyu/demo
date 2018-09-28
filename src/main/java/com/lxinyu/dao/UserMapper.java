package com.lxinyu.dao;

import com.lxinyu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by PC-Lxinyu on 2018/8/24.
 */
@Repository
@Mapper
public interface UserMapper {

    public User selectUser(User user);

    public int insertUser(User user);
}
