package com.salaries.controller;

import com.salaries.dto.MenuInfoDto;
import com.salaries.service.MenuInfoService;
import com.salaries.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MenuInfoController {

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("getMenuInfoByRoleId")
    public Object getMenuInfoByRoleId(@RequestParam int roleId){
        return menuInfoService.listMenu(roleId);
    }


//    @RequestMapping("listMenu")
//    public Object listMenu(){
//        return menuInfoService.listMenu();
//    }
}
