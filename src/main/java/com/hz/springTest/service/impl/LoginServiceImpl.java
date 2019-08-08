package com.hz.springTest.service.impl;

import com.hz.springTest.mapper.UserMapper;
import com.hz.springTest.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    /**
     *
     */
    @Resource
    private UserMapper userMapper;

    @Override
    public void queryInfo() {
        System.out.println("---------------------------");
//        userMapper.queryInfo();
//      UserMapper userMapper = new UserMapper();

    }
}
