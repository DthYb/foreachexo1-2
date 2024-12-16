package com.example;

public class Dog extends Animal {

    @Override
    public void move() {
        System.out.println("run");
    }

    @Override
    public void animalCry() {
        System.out.print("waf waf !");
    }
}
