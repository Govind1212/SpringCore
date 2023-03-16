package com.springcore.lifecycle;

public class Child {
    private String name;
    private double pocketMoney;

    public Child() {
        super();
    }

    public double getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(double pocketMoney) {
        System.out.println("Setting pocketmoney");
        this.pocketMoney = pocketMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", pocketMoney=" + pocketMoney +
                '}';
    }

    public void init()
    {
        System.out.println("in init method");
    }

    public void destroy()
    {
        System.out.println("in destroy method");
    }
}
