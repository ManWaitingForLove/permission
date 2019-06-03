package com.salaries.dto;

public class RoleDto {

    private int isNull;
    private int roleId;
    private String roleName;
    private String shortName;

    public RoleDto() {
    }

    public RoleDto(int isNull, int roleId, String roleName, String shortName) {
        this.isNull = isNull;
        this.roleId = roleId;
        this.roleName = roleName;
        this.shortName = shortName;
    }

    public int getIsNull() {
        return isNull;
    }

    public void setIsNull(int isNull) {
        this.isNull = isNull;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "RoleDto{" +
                "isNull=" + isNull +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
