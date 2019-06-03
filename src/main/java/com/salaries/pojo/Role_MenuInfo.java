package com.salaries.pojo;

public class Role_MenuInfo {
    private int rmId;
    private int roleId;
    private int menuId;

    public int getRmId() {
        return rmId;
    }

    public void setRmId(int rmId) {
        this.rmId = rmId;
    }

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
        return "Role_MenuInfo{" +
                "rmId=" + rmId +
                ", roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}
