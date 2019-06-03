package com.salaries.service;

import com.salaries.vo.Role_MenuVo;
import org.springframework.stereotype.Service;

public interface Role_MenuInfoService {

    boolean deleteRoleMenuInfoByRoleId(int roleId);
    int insertRoleMenuInfoByRoleId(Role_MenuVo role_menuVo);
}
