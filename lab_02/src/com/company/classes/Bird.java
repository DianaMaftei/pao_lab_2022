package com.company.classes;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(int age, String name) {
        super(age, name);
    }

    @Override
    public void makeSound() {
        System.out.println("This animal makes the sound: chirp!");
    }

    @Override
    public void move() {
        System.out.println("This animal moves by: flying");
    }

    @Override
    public boolean equals(Object o) {
        Bird b = (Bird) o;
        if (this.getAge() == b.getAge() && this.getName().equals(b.getName())) {
            return true;
        } else {
            return false;
        }

        // ctrl + alt + L = formatare

        // return this.getAge() == b.getAge() && this.getName().equals(b.getName());
    }

    @Override
    public String toString() {
        return "Bird's name is " + this.getName() +
                " and it is " + this.getAge() + " year(s) old";
    }

}
