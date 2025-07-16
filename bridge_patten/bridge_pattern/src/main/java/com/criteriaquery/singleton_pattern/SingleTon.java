package com.criteriaquery.singleton_pattern;

public class SingleTon {

    private static SingleTon instance;

    public static SingleTon getInstatnce(){
        if(instance==null){
            instance=new SingleTon();
        }
        return instance;
    }

    public static void showInstance(){
        System.out.println("Hello how are you");
    }
}
