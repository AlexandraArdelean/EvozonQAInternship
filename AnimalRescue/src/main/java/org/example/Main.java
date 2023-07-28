package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Brit Care");
        animalFood.setPrice(150);
        animalFood.setExpirationDate(LocalDate.of(2026, 11, 30));
        animalFood.setQuantity(15);
        animalFood.setStockAvailability("enough for a month");
        System.out.println("The name of the food is: " + animalFood.getName() + " and costs: " +
                animalFood.getPrice() + " RON," + " the quantity: " + animalFood.getQuantity() +
                "kg is " + animalFood.isStockAvailability());

        AnimalFood catFood = new AnimalFood();
        animalFood.setName("Purina");
        animalFood.setPrice(90);
        animalFood.setExpirationDate(LocalDate.of(2026, 11, 30));
        animalFood.setQuantity(8);
        animalFood.setStockAvailability("enough for a month");

        Dog dog = new Dog();
        dog.setName("Lola");
        dog.setAge(5);
        dog.setHealthLevel(10);
        dog.setHungerLevel(8);
        dog.setWeight(35);
        dog.setSpiritMood(10);
        dog.setBreed("Golden Retriever");
        dog.setColor("white");
        dog.setFavouriteFood(animalFood);
        dog.setFavouriteActivity(Activity.FETCH);
        System.out.println("My dog's name is: " + dog.getName() + " she's a " + dog.getBreed() +
                " and has " + dog.getAge() + " years old." + " Her favourite activity is playing "
                + dog.getFavouriteActivity().getName());
        dog.jumpingAround();

        Cat kittie = new Cat();
        kittie.setName("Kitty");
        kittie.setAge(2);
        kittie.setBreed("Russian blue");
        kittie.setColor("grey");
        kittie.setWeight(3);
        kittie.setSpiritMood(2);
        kittie.setHungerLevel(5);
        kittie.setFavouriteActivity(Activity.SNOOZE);
        kittie.setFavouriteFood(catFood);
        kittie.setHealthLevel(8);
        System.out.println("My cat's name is: " + kittie.getName() + " she's " + kittie.getBreed() + ". Kitty's favourite activity is to "
                + kittie.getFavouriteActivity().getName() + " out.");
        kittie.sleep();


        System.out.println();
        // story telling
        Girl annie = new Girl();
        annie.setName("Annie");
        annie.setMoneyAmount(250);

        annie.rescueAnimal();
        annie.feedAnimal();
        annie.goToVet();
        annie.doExercises();


    }
}