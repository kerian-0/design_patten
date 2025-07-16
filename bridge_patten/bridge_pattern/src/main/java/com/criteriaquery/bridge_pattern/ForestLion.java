package com.criteriaquery.bridge_pattern;

public class ForestLion extends Lion {


    public ForestLion(Animal animal) {
        super(animal);
    }

    @Override
    public void eat() {
        animal.eat();
    }
}
