package org.example;

public class Cow extends Animal{
    @Override
    public void eat(int quantity) {
        if (quantity > 10){
            setWeight(getWeight() + 10);
        }else {
            setHungerLevel(20);
        }
    }

    @Override
    public void sleep() {
        System.out.println("ZzZZz ZzZzz");

    }
}
