package com.company.singleton;


public class MyServiceEager {

// (A private constructor)
// (A static field containing its only instance)
// (A static factory method for obtaining the instance

    // Eager

    private static MyServiceEager instance = new MyServiceEager();

    private MyServiceEager(){}

    static MyServiceEager getInstance(){
        return instance;
    }
}
