package com.salaries.pojo;

public class UserInfo {

    /**
     * CREATE TABLE `userinfo` (
     *   `USERID` int(11) NOT NULL,
     *   `USERNAME` varchar(30) DEFAULT NULL,
     *   `PASSWORD` varchar(30) DEFAULT NULL,
     *   `REGEMAIL` varchar(100) DEFAULT NULL,
     *   `MOBILE` varchar(15) DEFAULT NULL,
     *   `ICON` varchar(255) DEFAULT NULL,
     *   PRIMARY KEY (`USERID`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表'
     */
    private int userId;
    private String userName;
    private String password;
    private String regEmail;
    private String mobile;
    private String icon;

    public UserInfo() {
    }

    public UserInfo(int userId, String userName, String password, String regEmail, String mobile, String icon) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.regEmail = regEmail;
        this.mobile = mobile;
        this.icon = icon;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", regEmail='" + regEmail + '\'' +
                ", mobile='" + mobile + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
