package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Activity activity = new Activity("playing fetch");
        AnimalFood animalFood = new AnimalFood("Acana Red Meat", 480, 12,
                LocalDate.of(2025, 12, 31), true);
        AnimalRescuer animalRescuer = new AnimalRescuer("Anna", 200);
        VetMed vetMed = new VetMed("Bogdan ionut", "veterinary doctor");
        Animal dog = new Animal("Lola", 5, 10, 8, 10, animalFood, activity);


    }
}