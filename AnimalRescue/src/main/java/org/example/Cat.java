package org.example;

public class Cat extends Animal {
    public Cat() {
    }

    @Override
    public void eat(int quantity) {
        if (quantity > 10) {
            setWeight(getWeight() + 2);
            setHungerLevel(getHungerLevel() - 2);
            setSpiritMood(getSpiritMood() + 2);
        } else {
            setHealthLevel(getHungerLevel() - 1);
            setSpiritMood(getSpiritMood() + 1);
        }
    }

    @Override
    public void sleep() {
        System.out.println("Purr! Purr! Purr!");
    }

    public void speak() {
        System.out.println("Meow! Meow!");
    }

    public void snooze() {
        System.out.println("I just ate so I am snoozing on the couch!");
    }

}
