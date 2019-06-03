package com.salaries.controller;

import com.salaries.mapper.UserInfoMapper;
import com.salaries.pojo.UserInfo;
import com.salaries.service.UserInfoService;
import com.salaries.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserInfoController {



    @Autowired
    UserInfoService userInfoService;



    @ResponseBody
    @RequestMapping("loginController")
    public Object login(@RequestBody UserInfoVo userInfoVo){
        UserInfo userInfo = userInfoService.userLogin(userInfoVo);
        if (userInfo != null){
            System.out.println("登陆成功！");
            //跳转交给后台处理，后台的"data"的值为此处的“true”
            return true;
        } else {
            System.out.println("登陆失败！");
        }
        //跳转交由后台处理，后台的"data"的值为此处的“false”
        return false;
    }





    @ResponseBody
    @RequestMapping("listAllUserInfos")
    public Object listAllUserInfos(){
        System.out.println("已列出所有用户信息");
        return userInfoService.listAllUserInfos();
    }




    @ResponseBody
    @RequestMapping("register")
    public Object register(@RequestBody UserInfoVo userInfoVo){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userInfoVo.getUserName());
        userInfo.setPassword(userInfoVo.getPassword());
        userInfo.setRegEmail(userInfoVo.getRegEmail());
        userInfo.setMobile(userInfoVo.getMobile());
        return userInfoService.register(userInfo);
    }




    @ResponseBody
    @RequestMapping("updateUserInfoById")
    public Object updateUserInfoById(@RequestBody UserInfo userInfo){
        System.out.println("此处已经过");
        boolean b = userInfoService.updateUserInfoById(userInfo);
        System.out.println(b+"此处已经过");
        return b;
    }





    @ResponseBody
    @RequestMapping("deleteUserInfoById")
    public Object deleteUserInfoById(@RequestParam int userId){
        return userInfoService.deleteUserInfoById(userId) == 1;
    }





    @ResponseBody
    @RequestMapping("findUserInfoById")
    public Object findUserInfoById(@RequestParam int userId){
        return userInfoService.findUserInfoById(userId);
    }



    @ResponseBody
    @RequestMapping("getUserInfoCount")
    public Object getUserInfoCount(){
        return userInfoService.getUserInfoCount();
    }




    @ResponseBody
    @RequestMapping("listRoleDtoByUserId")
    public Object listRoleDtoByUserId(@RequestParam int userId){
        return userInfoService.listRoleDtoByUserId(userId);
    }

}
