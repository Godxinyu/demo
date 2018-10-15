package com.lxinyu.serviceimpl;

import com.lxinyu.dao.RoleMapper;
import com.lxinyu.service.IRole;
import com.lxinyu.utils.MybatisConnection;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

/**
 * Created by PC-Lxinyu on 2018/10/11.
 */

@Service
public class RoleImpl implements IRole {


    @Override
    public String selectRoleName(int roleId) {
        SqlSession sqlSession = MybatisConnection.createSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        String roleName = roleMapper.selectRole(roleId);
        sqlSession.commit();
        sqlSession.close();
        return roleName;
    }
}
