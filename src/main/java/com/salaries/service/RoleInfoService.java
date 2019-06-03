package com.salaries.service;

import com.salaries.dto.MenuInfoDto;
import com.salaries.dto.RoleDto;
import com.salaries.pojo.RoleInfo;
import com.salaries.vo.RoleInfoVo;

import java.util.List;

public interface RoleInfoService {
    List<RoleDto> selectRoles(RoleInfoVo roleInfoVo);
    List<RoleDto> getRoleDtoByUserId(int userId);
    List<RoleInfo> listAllRoles();
}
