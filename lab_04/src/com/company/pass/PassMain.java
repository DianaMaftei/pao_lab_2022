package com.company.pass;

public class PassMain {

    public static void main(String[] args) {
        int number = 2;
        add(number);
        System.out.println(number);

        Animal animal = new Animal(5);
        changeAnimal(animal);
        System.out.println(animal);

        changeAge(animal);
        System.out.println(animal);
    }

    public static void add(int n) {
        n = n + 1;
    }

    public static void changeAnimal(Animal animal) {
        animal = new Animal(10);
    }

    public static void changeAge(Animal animal) {
        animal.setAge(10);
    }


}
