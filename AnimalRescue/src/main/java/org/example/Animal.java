package org.example;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int spiritMood;
    private AnimalFood favouriteFood;
    private Activity favouriteActivity;

    public Animal(String name, int age, int healthLevel, int hungerLevel, int spiritMood, AnimalFood favouriteFood, Activity favouriteActivity) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.spiritMood = spiritMood;
        this.favouriteFood = favouriteFood;
        this.favouriteActivity = favouriteActivity;
    }

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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && healthLevel == animal.healthLevel
                && hungerLevel == animal.hungerLevel && spiritMood == animal.spiritMood
                && Objects.equals(name, animal.name) && Objects.equals(favouriteFood, animal.favouriteFood)
                && Objects.equals(favouriteActivity, animal.favouriteActivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, healthLevel, hungerLevel, spiritMood, favouriteFood, favouriteActivity);
    }
}
