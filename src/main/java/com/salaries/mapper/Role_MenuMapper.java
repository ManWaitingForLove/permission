package com.salaries.mapper;

import com.salaries.vo.Role_MenuVo;

public interface Role_MenuMapper {

    int deleteRoleMenuInfoByRoleId(int RoleId);

    int insertRoleMenuInfoByRoleId(Role_MenuVo role_menuVo);
}
