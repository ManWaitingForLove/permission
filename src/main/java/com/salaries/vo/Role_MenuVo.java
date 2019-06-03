package com.salaries.vo;

import java.util.List;

public class Role_MenuVo {

    private int roleId;
    private int menuId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "Role_MenuVo{" +
                "roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}
