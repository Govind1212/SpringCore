package com.springcore.ci;

public class Person {
    private String name;
    private int personid;
    private Certi birthcertificate;

    public Person(String name, int personid, Certi birthcertificate) {
        super();
        this.name = name;
        this.personid = personid;
        this.birthcertificate = birthcertificate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personid=" + personid +
                ", birthcertificate=" + birthcertificate +
                '}';
    }
}
