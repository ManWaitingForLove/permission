package com.salaries.service;

import com.salaries.dto.RoleDto;
import com.salaries.pojo.UserInfo;
import com.salaries.vo.UserInfoVo;

import java.util.List;

public interface UserInfoService {

    UserInfo userLogin(UserInfoVo userInfoVo);

    List<UserInfo> listAllUserInfos();

    boolean register(UserInfo userInfo);

    boolean updateUserInfoById(UserInfo userInfo);

    int deleteUserInfoById(int userId);

    UserInfo findUserInfoById(int userId);

    int getUserInfoCount();

    List<RoleDto> listRoleDtoByUserId(int userId);

}
