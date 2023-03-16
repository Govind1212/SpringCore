package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Value("#{122+87-98*17}")
    private int x;

    @Value("#{T(java.lang.Math).sqrt(256)}")
    private double z;

    @Value("#{12+17+3}")
    private int y;

    @Value("#{T(java.lang.Math).PI}")
    private double e;
    public int getY() {
        return y;
    }

    @Value("#{new java.lang.String('Govind Chaurasiya')}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", z=" + z +
                ", y=" + y +
                ", e=" + e +
                ", name='" + name + '\'' +
                '}';
    }
}
