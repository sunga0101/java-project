package com.likelion.javaproject2.week6.day5;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }


    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
