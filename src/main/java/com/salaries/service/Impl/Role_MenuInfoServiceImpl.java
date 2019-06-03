package com.salaries.service.Impl;

import com.salaries.mapper.Role_MenuMapper;
import com.salaries.service.Role_MenuInfoService;
import com.salaries.vo.Role_MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Role_MenuInfoServiceImpl implements Role_MenuInfoService {

    @Autowired
    Role_MenuMapper role_menuMapper;

    public boolean deleteRoleMenuInfoByRoleId(int roleId) {
        return role_menuMapper.deleteRoleMenuInfoByRoleId(roleId)>0;
    }

    public int insertRoleMenuInfoByRoleId(Role_MenuVo role_menuVo) {
        return role_menuMapper.insertRoleMenuInfoByRoleId(role_menuVo);
    }
}
