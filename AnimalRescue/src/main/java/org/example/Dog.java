package org.example;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age, int healthLevel, int hungerLevel, int spiritMood, AnimalFood favouriteFood,
               Activity favouriteActivity, int weight, String color, String breed) {
        super(name, age, healthLevel, hungerLevel, spiritMood, favouriteFood, favouriteActivity, weight, color, breed);
    }

    @Override
    public void eat(int quantity) {
        while (getHungerLevel() > 3) {
            setWeight(getWeight() + 2);
            setSpiritMood(getSpiritMood() + 1);
            setHungerLevel(getHungerLevel() - 1);
            setHealthLevel(getHealthLevel() + 1);
        }

    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping: ZzZ ZzZzz");
    }


    public void speak() {
        System.out.println("Woof! Woof!");

    }

    public void jumpingAround() {
        System.out.println("I just ate, I am sooo haappyy I jump from joy!");
    }
}
