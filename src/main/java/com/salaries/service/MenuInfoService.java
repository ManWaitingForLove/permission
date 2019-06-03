package com.salaries.service;

import com.salaries.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoService {

    List<MenuInfoDto> listMenu(int roleId);

    List<MenuInfoDto> getMenuInfoByRoleId(int roleId);

}
