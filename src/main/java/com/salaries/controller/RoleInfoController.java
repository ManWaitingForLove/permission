package com.salaries.controller;

import com.salaries.dto.RoleDto;
import com.salaries.service.RoleInfoService;
import com.salaries.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping("getRoleDtoByUserId")
    public Object listAllRoles(int userId){
        return roleInfoService.getRoleDtoByUserId(userId);
    }


    @RequestMapping("selectRoles")
    public Object selectRoles(@RequestBody RoleInfoVo roleInfoVo){
        return roleInfoService.selectRoles(roleInfoVo);
    }


    @RequestMapping("listAllRoles")
    public Object listAllRoles(){
        return roleInfoService.listAllRoles();
    }

}
