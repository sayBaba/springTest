package com.hz.springTest.bean;

public class Person {

    private String userName;
    private String password;

    public Person(String userName,String password){
        this.userName = userName;
        this.password = password;
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

    public void sayHello(){
        System.out.println(userName+" say hello spring..........");
    }
}
