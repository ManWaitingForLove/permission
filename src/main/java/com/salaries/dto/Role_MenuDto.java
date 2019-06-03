package com.salaries.dto;

import com.salaries.vo.Role_MenuVo;

import java.util.List;

public class Role_MenuDto {

    private int roleId;
    private List<Integer> menuIds;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(List<Integer> menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        return "Role_MenuDto{" +
                "roleId=" + roleId +
                ", menuIds=" + menuIds +
                '}';
    }
}
