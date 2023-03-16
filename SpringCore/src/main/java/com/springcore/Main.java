package com.springcore;

import com.springcore.ci.Person;
import com.springcore.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        //Testing setter injection
        Student s = (Student) ctx.getBean("s1");
        Student st = (Student)ctx.getBean("s2");
        System.out.println(s);
        System.out.println(st);

        //testing injection with Refrence type
        A oba = (A)ctx.getBean("a1");
        System.out.println(oba.getX()+" "+oba.getObj().getY());
        System.out.println(oba);

        //testing constructor injection
        Person p = (Person)ctx.getBean("p1");
        System.out.println(p);


    }
}