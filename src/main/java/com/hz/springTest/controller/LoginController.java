package com.hz.springTest.controller;

import com.hz.springTest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //控制器
public class LoginController  {


    @Autowired
    private LoginService loginService;

    public void test(){

        loginService.queryInfo();
    }



}
