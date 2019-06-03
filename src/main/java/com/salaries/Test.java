package com.salaries;

import com.salaries.controller.UserInfoController;
import com.salaries.pojo.UserInfo;
import com.salaries.service.UserInfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        UserInfoService bean = applicationContext.getBean(UserInfoService.class);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("qianjue");
        userInfo.setUserId(1);
        userInfo.setPassword("123456");
        userInfo.setMobile("123456");
        userInfo.setRegEmail("123@qq.com");
        boolean b = bean.updateUserInfoById(userInfo);
        System.out.println(b);
    }

}
