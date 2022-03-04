package com.company.statics;

public class StaticsPlayground {

    static {
        System.out.println("In the static block 1");
    }

    static {
        System.out.println("In the static block 2");

    }

    {
        System.out.println("In the instance block");
    }

    // create static field
    // create static method
    // create static block
    // create constant


    public static int numberOfObjects = 0;

    public static final String MY_CONSTANT = "Jave rulz";

    public StaticsPlayground(){
        StaticsPlayground.numberOfObjects++;
        System.out.println(StaticsPlayground.numberOfObjects);
    }

    public static void main(String[] args) {
        StaticsPlayground x = new StaticsPlayground();
        StaticsPlayground y = new StaticsPlayground();
        StaticsPlayground.staticMethod(); // Recommended
        x.staticMethod();   // Not Recommended
    }

    public static void staticMethod(){
        System.out.println("This is a static method");
    }

    static {
        System.out.println("In the static block 3");

    }

}
