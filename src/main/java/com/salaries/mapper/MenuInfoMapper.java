package com.salaries.mapper;

import com.salaries.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoMapper {

    List<MenuInfoDto> listMenu(int roleId);

    List<MenuInfoDto> getMenuInfoByRoleId(int roleId);

}
