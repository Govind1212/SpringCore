package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[]args)
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spel.xml");
        Demo demo = ctx.getBean("demo", Demo.class);
        System.out.println(demo);

        SpelExpressionParser spelp = new SpelExpressionParser();
        Expression expression = spelp.parseExpression("22+44*12");
        System.out.println(expression.getValue());
    }
}
