package com.salaries.controller;

import com.salaries.service.User_RoleService;
import com.salaries.vo.InsertRoleInfoByUserIdVo;
import com.salaries.vo.User_RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User_RoleController {

    @Autowired
    User_RoleService user_roleService;

    @RequestMapping("insertRoleInfoByUserId")
    public Object insertRoleInfoByUserId(@RequestBody InsertRoleInfoByUserIdVo insertRoleInfoByUserIdVo){
        boolean flag = false;
        User_RoleVo user_roleVo = new User_RoleVo();
        user_roleVo.setUserId(insertRoleInfoByUserIdVo.getUserId());
        List<Integer> roleIdList = insertRoleInfoByUserIdVo.getRoleIdList();
        for (Integer roleId : roleIdList) {
            user_roleVo.setRoleId(roleId);
            flag = user_roleService.insertRoleInfoByUserId(user_roleVo);
        }
        return flag;
    }

    @RequestMapping("deleteRoleInfoByUserId")
    public Object deleteRoleInfoByUserId(@RequestParam int userId){
        return user_roleService.deleteRoleInfoByUserId(userId);
    }

}
