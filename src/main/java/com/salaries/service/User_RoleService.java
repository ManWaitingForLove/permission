package com.salaries.service;

import com.salaries.vo.User_RoleVo;

public interface User_RoleService {
    boolean insertRoleInfoByUserId(User_RoleVo user_roleVo);
    boolean deleteRoleInfoByUserId(int userId);
}
