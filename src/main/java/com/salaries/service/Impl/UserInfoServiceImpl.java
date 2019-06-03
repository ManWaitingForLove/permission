package com.salaries.service.Impl;

import com.salaries.dto.RoleDto;
import com.salaries.mapper.UserInfoMapper;
import com.salaries.pojo.UserInfo;
import com.salaries.service.UserInfoService;
import com.salaries.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;


    public UserInfo userLogin(UserInfoVo userInfoVo){
        return userInfoMapper.userLogin(userInfoVo);
    }



    public List<UserInfo> listAllUserInfos() {
        return userInfoMapper.listAllUserInfos();
    }




    @Transactional(propagation = Propagation.REQUIRED)
    public boolean register(UserInfo userInfo) {
        int i = userInfoMapper.register(userInfo);
        if (i == 1){
            System.out.println("添加成功！");
            return true;
        }
        System.out.println("添加失败！");
        return false;
    }





    @Transactional(propagation = Propagation.REQUIRED)
    public boolean updateUserInfoById(UserInfo userInfo){
        return userInfoMapper.updateUserInfoById(userInfo) == 1;
    }



    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteUserInfoById(int userId) {
        return userInfoMapper.deleteUserInfoById(userId);
    }




    public UserInfo findUserInfoById(int userId) {
        return userInfoMapper.findUserInfoById(userId);
    }




    public int getUserInfoCount() {
        return userInfoMapper.getUserInfoCount();
    }





    public List<RoleDto> listRoleDtoByUserId(int userId) {
        return userInfoMapper.listRoleDtoByUserId(userId);
    }

}
