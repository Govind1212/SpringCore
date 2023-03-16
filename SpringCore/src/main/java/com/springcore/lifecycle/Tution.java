package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Tution {
    private String location;

    public Tution() {
        super();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Tution{" +
                "location='" + location + '\'' +
                '}';
    }

    @PostConstruct
    public void welcome()
    {
        System.out.println("You are welcome!!!...");
    }

    @PreDestroy
    public void bye()
    {
        System.out.println("See you Tomorrow...");
    }
}
