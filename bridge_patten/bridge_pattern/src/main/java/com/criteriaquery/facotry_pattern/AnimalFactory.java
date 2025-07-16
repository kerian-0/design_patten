package com.criteriaquery.facotry_pattern;

public class AnimalFactory {

    public static Animal getAnimal(String type){
        if(type.equals("dog")){
            return new Dog();
        }
        else if(type.equals("lion")){
            return new Lion();
        }
        return null;
    }
}
