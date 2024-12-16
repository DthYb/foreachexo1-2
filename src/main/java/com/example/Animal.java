package com.example;

public class Animal {
    String name;
    private MoveBehaviour moveBehaviour;

    public void animalCry() {
    }

    public void move() {
        moveBehaviour.move();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void AnimalCry(String name) {
    // switch (name) {
    // case "cat":
    // System.out.println("meow !");
    // break;
    // case "dog":
    // System.out.println("Waf waf !");
    // break;
    // default:
    // System.out.println("quack !");
    // }
    // }

    // public void move(String name) {
    // switch (name) {
    // case "cat":
    // System.out.println("walk");
    // break;
    // case "dog":
    // System.out.println("walk");
    // break;
    // default:
    // System.out.println("fly");
    // }
    // }
}
