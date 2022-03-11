package com.company.singleton;

import com.company.abstracts.ConcreteClass;
import com.company.singleton.MyServiceEager;
import com.company.singleton.MyServiceLazy;

public class Main {
    public static void main(String[] args) {

//        MyService myService1 = new MyService(); -> does not compile, constructor is private

        MyServiceLazy myService2 = MyServiceLazy.getInstance();
        MyServiceEager myServiceEager3;

        ConcreteClass obj = new ConcreteClass("clasa1", "tip1");
        System.out.println(obj.getName());
        System.out.println(obj.getType());
        System.out.println(obj.getAll());


    }

}
