package com.salaries.controller.thymeleaf;

import com.salaries.mapper.UserInfoMapper;
import com.salaries.pojo.UserInfo;
import com.salaries.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListUsersThymeleafController {

    @Autowired
    UserInfoMapper userInfoMapper;

    @RequestMapping("listUserInfos")
    public ModelAndView listUserInfos(ModelAndView map){
        List<UserInfo> userInfoList = userInfoMapper.listAllUserInfos();
        System.out.println(userInfoList);
        map.addObject("userInfoList",userInfoList);
        //入域到user_copy.html
        System.out.println("下一步入域到user_copy.html");
        map.setViewName("user_copy");
        return map;
    }


}
