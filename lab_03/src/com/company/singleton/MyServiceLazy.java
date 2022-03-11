package com.company.singleton;

public class MyServiceLazy {

// (A private constructor)
// (A static field containing its only instance)
// (A static factory method for obtaining the instance

    // Lazy

    private static MyServiceLazy instance;

    private MyServiceLazy() {
    }

    static MyServiceLazy getInstance() {
        if (instance == null) {
            instance = new MyServiceLazy();
        }
        return instance;
    }
}
