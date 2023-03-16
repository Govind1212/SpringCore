package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
    public static void main(String[]args) throws IOException
    {
        AbstractApplicationContext ctx  = new ClassPathXmlApplicationContext("autowire.xml");
        //Emp emp1 = ctx.getBean("emp1", Emp.class);
        //System.out.println(emp1);

        Per p1 = ctx.getBean("person", Per.class);
        System.out.println(p1);
    }
}
