package com.salaries;

import com.salaries.pojo.RoleInfo;
import lombok.Lombok;

public class TestLombok {
    public static void main(String[] args) {

        RoleInfo roleInfo = new RoleInfo();
        roleInfo.setRoleId(2);
        roleInfo.setRoleName("吴承洋");
        System.out.println(roleInfo);

    }
}
