package com.csqf.personnelmanagementsystem.interceptor;

import com.csqf.personnelmanagementsystem.entity.TUserInfomation;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Xu
 * @createTime 2020/3/19
 * @description
 */
public class LoginInterceptor implements HandlerInterceptor {

//    handler执行之前
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("该页面检测session");
        TUserInfomation user = (TUserInfomation)httpServletRequest.getSession().getAttribute("user");
        if (null == user){
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/userindex");
            return false;
        }
        return true;
    }

//    handler执行之后，返回modelandview之前
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

//    完全执行完成handler，已经返回modelandview
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
