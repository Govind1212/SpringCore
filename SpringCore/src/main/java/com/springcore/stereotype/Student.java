package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student")
@Scope("prototype")
public class Student {

    @Value("Govind Chaurasiya")
    private String sname;

    @Value("Palghar")
    private String scity;

    @Value("#{temp}")
    private List<String>address;

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public String getSname() {
        return sname;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", scity='" + scity + '\'' +
                '}';
    }
}
