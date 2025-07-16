package com.criteriaquery.bridge_pattern;

public interface Animal {

    void eat();
    void sleep();
}

class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
