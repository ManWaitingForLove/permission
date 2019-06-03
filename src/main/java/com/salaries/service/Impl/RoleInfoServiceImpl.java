package com.salaries.service.Impl;

import com.salaries.dto.RoleDto;
import com.salaries.mapper.RoleInfoMapper;
import com.salaries.pojo.RoleInfo;
import com.salaries.service.RoleInfoService;
import com.salaries.vo.RoleInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    public List<RoleDto> getRoleDtoByUserId(int userId) {
        return roleInfoMapper.getRoleDtoByUserId(userId);
    }

    public List<RoleInfo> listAllRoles() {

        return roleInfoMapper.listAllRoles();
    }


    public List<RoleDto> selectRoles(RoleInfoVo roleInfoVo) {
        return roleInfoMapper.selectRoles(roleInfoVo);
    }


}
