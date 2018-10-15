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



    @Override
    public int insertUserRole(UserRoleRelation userRoleRelation) {
        SqlSession sqlSession = MybatisConnection.createSqlSession();
        UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
        int userRoleInsertCount = userRoleMapper.insertUserRole(userRoleRelation);
        sqlSession.commit();
        sqlSession.close();
        return userRoleInsertCount;
    }

    @Override
    public int selectUserRole(int userId) {
        SqlSession sqlSession = MybatisConnection.createSqlSession();
        UserRoleMapper userRoleMapper = sqlSession.getMapper(UserRoleMapper.class);
        int roleNum = userRoleMapper.selectUserRole(userId);
        sqlSession.commit();
        sqlSession.close();
        return roleNum;
    }
}
