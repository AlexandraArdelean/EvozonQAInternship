package org.example;

public class Cat extends Animal {
    public Cat() {
    }


    @Override
    public void eat(int quantity) {
        setWeight(getWeight() + 1);
        setHungerLevel(getHungerLevel() - 1);
        setSpiritMood(getSpiritMood() + 1);
        System.out.println("Hap! Hap! Hap!");
    }

    @Override
    public void sleep() {
        System.out.println("Purr! Purr! Purr!");
    }

    public void speak() {
        System.out.println("Meow! Meow!");
    }

    public void snoozing() {
        System.out.println("I just ate so I am snoozing on the couch!");
    }

}
