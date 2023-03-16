package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean {
    private double fees;

    public Teacher() {
        super();
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fees=" + fees +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Class Started");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Class finished");
    }
}
