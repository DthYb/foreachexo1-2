package com.example;

public class Duck extends Animal {

    @Override
    public void animalCry() {
        System.out.print("quack !");
    }

    @Override
    public void move() {
        System.out.println("fly");
    }
}
