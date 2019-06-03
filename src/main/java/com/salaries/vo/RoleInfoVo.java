package com.salaries.vo;

public class RoleInfoVo {

    private String roleName;
    private String shortName;

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
        return "RoleInfoVo{" +
                "roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }

}
