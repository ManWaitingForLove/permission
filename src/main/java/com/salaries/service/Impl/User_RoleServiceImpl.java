package com.salaries.service.Impl;

import com.salaries.mapper.User_RoleMapper;
import com.salaries.service.User_RoleService;
import com.salaries.vo.User_RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_RoleServiceImpl implements User_RoleService {

    @Autowired
    User_RoleMapper user_roleMapper;

    public boolean insertRoleInfoByUserId(User_RoleVo user_roleVo) {
        return user_roleMapper.insertRoleInfoByUserId(user_roleVo) == 1;
    }

    public boolean deleteRoleInfoByUserId(int userId) {
        return user_roleMapper.deleteRoleInfoByUserId(userId) == 1;
    }
}
