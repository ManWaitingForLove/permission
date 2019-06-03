package com.salaries.service.Impl;

import com.salaries.dto.MenuInfoDto;
import com.salaries.mapper.MenuInfoMapper;
import com.salaries.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> listMenu(int roleId){
        return menuInfoMapper.listMenu(roleId);
    }

    public List<MenuInfoDto> getMenuInfoByRoleId(int roleId) {
        return menuInfoMapper.getMenuInfoByRoleId(roleId);
    }
}
