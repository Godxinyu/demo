package com.lxinyu.serviceimpl;

import com.lxinyu.dao.UserRoleMapper;
import com.lxinyu.entity.UserRoleRelation;
import com.lxinyu.service.IUserRoleRelation;
import com.lxinyu.utils.MybatisConnection;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 * Created by PC-Lxinyu on 2018/9/6.
 */
@Service
public class UserRoleRelationImpl implements IUserRoleRelation {

    SqlSession sqlSession = MybatisConnection.createSqlSession();

    @Override
    public int insertUserRole(UserRoleRelation userRoleRelation) {
        UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
        return userRoleMapper.insertUserRole(userRoleRelation);
    }
}
