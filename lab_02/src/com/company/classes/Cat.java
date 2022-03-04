package com.company.classes;

public class Cat extends Animal {
    private CatBreed breed;

    public Cat(CatBreed catbreed,int age, String name){
        super(age,name);
        this.breed = catbreed;
    }

    public CatBreed getBreed() {
        return breed;
    }

    public void setBreed(CatBreed breed) {
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("This animal makes the sound: ham");
    }

    public void move() {
        System.out.println("This animal moves by: jumping");
    }
}
