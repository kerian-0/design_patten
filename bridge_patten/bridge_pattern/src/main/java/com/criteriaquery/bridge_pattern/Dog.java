package com.criteriaquery.bridge_pattern;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
