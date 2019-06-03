package com.salaries.controller;

import com.salaries.dto.Role_MenuDto;
import com.salaries.service.Role_MenuInfoService;
import com.salaries.vo.Role_MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Role_MenuInfoController {

    @Autowired
    Role_MenuInfoService role_menuInfoService;

    @RequestMapping("/insertRoleMenuInfoByRoleId")
    public Object insertRoleMenuInfoByRoleId(@RequestBody Role_MenuDto role_menuDto) {

        int roleId = role_menuDto.getRoleId();
        List<Integer> menuIds = role_menuDto.getMenuIds();
        int sum = 0;
        if (role_menuInfoService.deleteRoleMenuInfoByRoleId(roleId)) {
            Role_MenuVo role_menuVo = new Role_MenuVo();
            role_menuVo.setRoleId(roleId);
            for (Integer menuId : menuIds) {
                role_menuVo.setMenuId(menuId);
                int i = role_menuInfoService.insertRoleMenuInfoByRoleId(role_menuVo);
                sum += i;
            }
        }
        return sum>0;

    }


}
