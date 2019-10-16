package com.wang.blog.sunny_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/** 博客主页首页入口 以及 注册
 * @author Wang
 * @description
 * @create 2019-10-15 23:59
 */
@Controller
public class SunnyBlogController {

    @GetMapping({"/","","/index"})
    public String index(HttpServletRequest request){


        return "/index";
    }

    @GetMapping({"/about"})
    public String about(HttpServletRequest request){
        return "/about";
    }

    @GetMapping({"/detail"})
    public String detail(HttpServletRequest request){
        return "/detail";
    }
}
