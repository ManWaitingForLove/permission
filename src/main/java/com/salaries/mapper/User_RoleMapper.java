package com.salaries.mapper;

import com.salaries.vo.User_RoleVo;

public interface User_RoleMapper {
    int insertRoleInfoByUserId(User_RoleVo user_roleVo);
    int deleteRoleInfoByUserId(int userId);
}
