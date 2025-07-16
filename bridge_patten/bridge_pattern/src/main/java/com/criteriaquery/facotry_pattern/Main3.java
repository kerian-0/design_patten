package com.criteriaquery.facotry_pattern;

public class Main3 {

    public static void main(String[] args){
        Animal animal = AnimalFactory.getAnimal("dog");
        animal.speak();

        Animal animal1 = AnimalFactory.getAnimal("lion");
        animal1.speak();

    }
}
