package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[]args) throws IOException
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Stereotype.xml");
        Student s = ctx.getBean("student", Student.class);
        System.out.println(s);
        System.out.println(s.getAddress());
        System.out.println(s.hashCode());
        System.out.println(ctx.getBean("student").hashCode());
        System.out.println(ctx.getBean("teacher").hashCode());
        System.out.println(ctx.getBean("teacher").hashCode());
    }
}
