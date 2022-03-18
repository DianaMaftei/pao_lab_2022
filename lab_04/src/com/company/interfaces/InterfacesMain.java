package com.company.interfaces;

public class InterfacesMain {

    public static void main(String[] args) {
        Greeting greeting = new Hello();
        greeting.sayGreeting();
        greeting.method1();
        Greeting.method2();

        Hello hello = new Hello();
        hello.sayGreeting();
        hello.method1();

        MyConcreteClass myConcreteClass = new MyConcreteClass();
        Greeting g1 = new MyConcreteClass();
        MyInterface myInterface = new MyConcreteClass();
        MyInterface2 myInterface2 = new MyConcreteClass();
        MyInterface3 myInterface3 = new MyConcreteClass();
    }
}
