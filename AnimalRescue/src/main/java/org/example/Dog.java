package org.example;

public class Dog extends Animal {
    public Dog() {
    }

    @Override
    public void eat(int quantity) {
        if (quantity > 150) {
            setWeight(getWeight() + 2);
            setSpiritMood(getSpiritMood() + 2);
            setHungerLevel(getHungerLevel() - 2);
            setHealthLevel(getHealthLevel() + 1);
        } else {
            setSpiritMood(getSpiritMood() + 1);
            setHungerLevel(getHungerLevel() + 1);
        }

    }

    @Override
    public void sleep() {
        System.out.println(" ZzZ ZzZzz");
    }


    public void speak() {
        System.out.println("Woof! Woof!");

    }

    public void jumpingAround() {
        System.out.println("I just ate, I am sooo haappyy I jump from joy!");
    }
}
