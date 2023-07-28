package org.example;

import java.util.Objects;

public abstract class Doctor {
    private String name;
    private String specialization;

    public Doctor() {
    }

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public abstract void givesConsult();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "VetMed{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor vetMed)) return false;
        return Objects.equals(getName(), vetMed.getName())
                && Objects.equals(getSpecialization(), vetMed.getSpecialization());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpecialization());
    }
}
