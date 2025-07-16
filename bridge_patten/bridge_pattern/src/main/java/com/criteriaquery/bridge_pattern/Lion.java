package com.criteriaquery.bridge_pattern;

public abstract class Lion {

    protected Animal animal;
    public Lion(Animal animal) {
        this.animal = animal;
    }

    public abstract void eat();
}

