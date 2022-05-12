package com.company.examprep.model2;

public class Ex2 {
    public static void main(String[] args) {
        Drink tea = new Tea();
        tea.make();
    }
}

class Drink {
    public static void make() {
        System.out.println("Making drink");
    }
}

class Tea extends Drink {
    public static void make() {
        System.out.println("Making tea");
    }
}
