package com.springcore.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test {
     public static void main(String[]args) throws IOException
     {
         AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Standalone.xml");
         Person person = ctx.getBean("person2", Person.class);
         System.out.println(person);

     }
}
