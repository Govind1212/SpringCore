package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    public String employeeName;
    private List<String> phones;

    private Set<String> address;
    private Map<String, String> courses;

    private Properties props;

    public Employee(String employeeName, Set<String>address, List<String> phones, Map<String, String>courses, Properties props) {
        super();
        this.employeeName = employeeName;
        this.address = address;
        this.courses = courses;
        this.phones = phones;
        this.props = props;
    }

    public  Employee()
    {
        super();
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
