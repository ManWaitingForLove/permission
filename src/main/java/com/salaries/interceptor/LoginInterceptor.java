package com.salaries.interceptor;

import com.salaries.pojo.UserInfo;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class LoginInterceptor implements HandlerInterceptor {

    //前置
    public boolean preHandle(HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取页面名及其后缀
        String URI = httpServletRequest.getRequestURI();
        System.out.println(URI);
        if (URI.equals("/login.html")||URI.equals("/reg.html")) {
            return true;
        }
        UserInfo userInfo = (UserInfo)httpServletRequest.getSession().getAttribute("userInfo");
        if (userInfo != null){
            return true;
        }
        //不符合条件的给出提示信息，并转发到登录页面
        httpServletRequest.setAttribute("msg", "您还没有登录，请先登录！");
        httpServletRequest.getRequestDispatcher("login.html").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    //提交处理
    public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    //后置
    public void afterCompletion(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
