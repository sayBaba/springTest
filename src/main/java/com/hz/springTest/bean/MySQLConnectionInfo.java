package com.hz.springTest.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MySQLConnectionInfo {

    @Value("#{configProperties['mysql.url']}")
    private String url;

    @Value("#{configProperties['mysql.userName']}")
    private String userName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }




}
