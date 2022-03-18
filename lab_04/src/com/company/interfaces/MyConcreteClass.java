package com.company.interfaces;

public class MyConcreteClass implements MyInterface3{
    @Override
    public void sayGreeting() {
        System.out.println("say greeting from concrete");
    }

    @Override
    public void myMethod1() {
        System.out.println(" from my method 1");
    }

    @Override
    public void myMethod2() {
        System.out.println(" from my method 2");
    }
}
