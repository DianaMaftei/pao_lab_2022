package com.company.examprep.model2;

public class Ex14 {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
    }
}

class A {
    int x;

    public A() {
        init(0);
    }

    protected void init(int x) {
        this.x = x;
    }
}

class B extends A {
    public B() {
        init(super.x + 1);
    }

    public void init(int x) {
        this.x = x + 1;
    }
}


