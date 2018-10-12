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
    SqlSession sqlSession = MybatisConnection.createSqlSession();

    @Override
    public String selectRoleName(int roleId) {
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        return roleMapper.selectRole(roleId);
    }
}
