package com.lxinyu.serviceimpl;

import com.lxinyu.dao.UserMapper;
import com.lxinyu.entity.User;
import com.lxinyu.service.IUser;
import com.lxinyu.utils.MybatisConnection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PC-Lxinyu on 2018/8/20.
 */
@Service
public class UserImpl implements IUser {


//    @Autowired
//    private UserMapper userMapper;

    @Override
    public User selectUser(String username, String password) {
        SqlSession sqlSession = MybatisConnection.createSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();

        user.setPassword(password);

        user.setUsername(username);

        user = userMapper.selectUser(user);

//        User user = new User();
//
//        user.setAge(25);
//        user.setName("aaa");
//        user.setPassword("abc");
        sqlSession.commit();
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> showUsers() {
        return null;
    }

    @Override
    public int insertUser(User user) {
        SqlSession sqlSession = MybatisConnection.createSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int insertCount = userMapper.insertUser(user);
        sqlSession.commit();
        sqlSession.close();
        return insertCount;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String username, String password) {
        return 0;
    }
}
