package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[]args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee e = (Employee) ctx.getBean("e1");
        System.out.println(e.getEmployeeName()+" "+e.getPhones()+" "+e.getCourses()+" "+e.getProps());
        System.out.println(e.getPhones().getClass());
    }
}
