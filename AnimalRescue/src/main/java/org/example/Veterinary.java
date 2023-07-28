package org.example;


import java.time.LocalDate;
import java.util.Objects;

public class Veterinary extends Doctor {
    public Veterinary() {
    }

    public Veterinary(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void givesConsult() {

    }
}
