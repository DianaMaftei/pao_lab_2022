package com.company.interfaces;

public class Hello implements Greeting {

    @Override
    public void sayGreeting() {
        System.out.println("Hello" + greetingSign);
    }

    @Override
    public void method1(){
        System.out.println("from overriden method 1");
    }
}
