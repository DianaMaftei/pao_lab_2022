package com.company.classes;

public class AnimalFarmPlayground {

    public static void main(String[] args) {

//        Animal myAnimal = new Animal(); -> will not compile if we create a custom constructor
        Animal myAnimal2 = new Animal(2);
        System.out.println(myAnimal2);
        System.out.println(myAnimal2.getAge());

        Animal dog = new Animal(5, "Rex");
        System.out.println(dog.getAge());
        System.out.println(dog.getName());

        dog.makeSound();
        dog.move();

        System.out.println("-----------------------------------");

        Bird bird = new Bird();

        bird.makeSound();
        bird.move();

        Cat cat1 = new Cat(CatBreed.BRITISH_SHORT_HAIR, 2,"lisa");

        System.out.println(cat1.getBreed());
        System.out.println(cat1.getName());

        System.out.println("-----------------------------------");

        Bird bird1 = new Bird(1, "Lisa");
        Bird bird2 = new Bird(1, "Lisa");
        Bird bird3 = bird1;

        System.out.println(bird1 == bird2);
        System.out.println(bird1.equals(bird2));
        System.out.println(bird1 == bird3);

        System.out.println(bird1);
        System.out.println(bird2);

    }
}
