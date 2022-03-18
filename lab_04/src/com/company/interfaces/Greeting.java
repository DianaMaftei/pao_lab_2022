package com.company.interfaces;

public interface Greeting {
    String greetingSign = "!";

    void sayGreeting();

    default void method1(){
        System.out.println("a");
    }

    static void method2(){
        System.out.println("b");
    }

}
