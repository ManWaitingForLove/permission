package com.salaries.vo;

import javax.xml.soap.SAAJResult;

public class UserInfoVo {

    private String userName;
    private String password;
    private String regEmail;
    private String mobile;

    public UserInfoVo() {
    }

    public UserInfoVo(String userName, String password, String regEmail, String mobile) {
        this.userName = userName;
        this.password = password;
        this.regEmail = regEmail;
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", regEmail='" + regEmail + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
