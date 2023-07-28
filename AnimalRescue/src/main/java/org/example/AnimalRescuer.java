package org.example;

import java.util.Objects;

public class AnimalRescuer {
    private String name;
    private int moneyAmount;

    public AnimalRescuer(String name, int moneyAmount) {
        this.name = name;
        this.moneyAmount = moneyAmount;
    }

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
