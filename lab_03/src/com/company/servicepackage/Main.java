package com.company.servicepackage;

public class Main {
    public static void main(String[] args) {
        // does not compile since the getInstance method is in a different package
        // MyServiceEager myServiceEager = MyServiceEager.getInstance();
    }
}
