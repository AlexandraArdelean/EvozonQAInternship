package org.example;

import java.util.Objects;

public abstract class AnimalRescuer {
    private String name;
    private int moneyAmount;

    public AnimalRescuer() {
    }
    public abstract void goToVet(Animal animal, Doctor doctor);
    public abstract void rescueAnimal(Animal animal, AnimalFood animalFood);
    public abstract void feedAnimal(Animal animal, AnimalFood animalFood);
    public abstract void doExercises(Animal animal);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String toString() {
        return "AnimalRescuer{" +
                "name='" + name + '\'' +
                ", moneyAmount=" + moneyAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalRescuer that)) return false;
        return getMoneyAmount() == that.getMoneyAmount() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMoneyAmount());
    }
}
