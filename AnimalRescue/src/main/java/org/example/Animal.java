package org.example;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int spiritMood;
    private AnimalFood favouriteFood;
    private Activity favouriteActivity;
    private int weight;
    private String color;
    private String breed;

    public Animal() {
    }

    public Animal(String name, int age, int healthLevel, int hungerLevel, int spiritMood,
                  AnimalFood favouriteFood, Activity favouriteActivity, int weight, String color, String breed) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.spiritMood = spiritMood;
        this.favouriteFood = favouriteFood;
        this.favouriteActivity = favouriteActivity;
        this.weight = weight;
        this.color = color;
        this.breed = breed;
    }

    public abstract void eat(int quantity);

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getSpiritMood() {
        return spiritMood;
    }

    public void setSpiritMood(int spiritMood) {
        this.spiritMood = spiritMood;
    }

    public AnimalFood getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(AnimalFood favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public Activity getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(Activity favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthLevel=" + healthLevel +
                ", hungerLevel=" + hungerLevel +
                ", spiritMood=" + spiritMood +
                ", favouriteFood=" + favouriteFood +
                ", favouriteActivity=" + favouriteActivity +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getAge() == animal.getAge() && getHealthLevel() == animal.getHealthLevel()
                && getHungerLevel() == animal.getHungerLevel()
                && getSpiritMood() == animal.getSpiritMood()
                && getWeight() == animal.getWeight() && Objects.equals(getName(),
                animal.getName()) && Objects.equals(getFavouriteFood(),
                animal.getFavouriteFood()) && getFavouriteActivity() == animal.getFavouriteActivity()
                && Objects.equals(getColor(), animal.getColor()) && Objects.equals(getBreed(), animal.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHealthLevel(),
                getHungerLevel(), getSpiritMood(), getFavouriteFood(),
                getFavouriteActivity(), getWeight(), getColor(), getBreed());
    }
}
