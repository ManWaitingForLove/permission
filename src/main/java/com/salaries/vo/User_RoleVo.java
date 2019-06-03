package com.salaries.vo;

public class User_RoleVo {

    private int userId;
    private int roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "User_RoleVo{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
