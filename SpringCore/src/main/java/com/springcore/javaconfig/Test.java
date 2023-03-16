package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.IOException;

public class Test {
    public static  void main(String[]args) throws IOException
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Javaconfig.class);
        Student st = ctx.getBean("student", Student.class);
        System.out.println(st.hashCode());
        st.studying();
    }
}
