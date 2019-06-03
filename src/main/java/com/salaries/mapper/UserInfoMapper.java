package com.salaries.mapper;

import com.salaries.dto.RoleDto;
import com.salaries.pojo.UserInfo;
import com.salaries.vo.RoleInfoVo;
import com.salaries.vo.UserInfoVo;

import java.util.List;

public interface UserInfoMapper {

    UserInfo userLogin(UserInfoVo userInfoVo);

    List<UserInfo> listAllUserInfos();

    int register(UserInfo userInfo);

    int updateUserInfoById(UserInfo userInfo);

    int deleteUserInfoById(int userId);

    UserInfo findUserInfoById(int userId);

    int getUserInfoCount();

    List<RoleDto> listRoleDtoByUserId(int userId);

    List<RoleDto> getAllRolesBy(RoleInfoVo roleInfoVo);


}
