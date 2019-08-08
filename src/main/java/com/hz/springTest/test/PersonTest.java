package com.hz.springTest.test;

import com.hz.springTest.SayHelp;
import com.hz.springTest.bean.Customer;
import com.hz.springTest.bean.Dept;
import com.hz.springTest.bean.MySQLConnectionInfo;
import com.hz.springTest.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PersonTest {

    public static  void  main (String []args){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Customer c = applicationContext.getBean("customer", Customer.class);
        List<Dept> list = c.getEmpList();
        System.out.println("---------list.size()="+list.size());

        System.out.println("======="+c.getEmpMap().size());

        MySQLConnectionInfo connInfo = applicationContext.getBean(MySQLConnectionInfo.class);
        System.out.println("============"+connInfo.getUrl());

//        person.sayHello();

//        SayHelp sayHelp = applicationContext.getBean("sayHelp", SayHelp.class);
//        sayHelp.getHello().sayHello();



    }
}
