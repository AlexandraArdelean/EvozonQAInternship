//package org.example;
//
//
//import java.time.LocalDate;
//
//public class Main {
//    public static void main(String[] args) {
//        AnimalFood dogFood = new AnimalFood();
//        dogFood.setName("Brit Care");
//        dogFood.setPrice(150);
//        dogFood.setExpirationDate(LocalDate.of(2026, 11, 30));
//        dogFood.setQuantity(15);
//        dogFood.setStockAvailability("enough for a month");
//        System.out.println("The name of the food is: " + dogFood.getName() + " and costs: " +
//                dogFood.getPrice() + " RON," + " the quantity: " + dogFood.getQuantity() +
//                "kg is " + dogFood.isStockAvailability());
//
//        AnimalFood catFood = new AnimalFood();
//        catFood.setName("Purina");
//        catFood.setPrice(90);
//        catFood.setExpirationDate(LocalDate.of(2026, 11, 30));
//        catFood.setQuantity(8);
//        catFood.setStockAvailability("enough for a month");
//
//        Dog dog = new Dog();
//        dog.setName("Lola");
//        dog.setAge(5);
//        dog.setHealthLevel(10);
//        dog.setHungerLevel(8);
//        dog.setWeight(35);
//        dog.setSpiritMood(2);
//        dog.setBreed("golden retriever");
//        dog.setColor("white");
//        dog.setFavouriteFood(dogFood);
//        dog.setFavouriteActivity(Activity.FETCH);
//        dog.setTypeOfAnimal("dog");
//        System.out.println("My dog's name is: " + dog.getName() + " she's a " + dog.getBreed() +
//                " and has " + dog.getAge() + " years old." + " Her favourite activity is playing "
//                + dog.getFavouriteActivity().getName());
//
//        dog.sleep();
//        dog.jumpingAround();
//
//        Cat kittie = new Cat();
//        kittie.setName("Kitty");
//        kittie.setAge(2);
//        kittie.setBreed("russian blue");
//        kittie.setColor("grey");
//        kittie.setWeight(3);
//        kittie.setSpiritMood(2);
//        kittie.setHungerLevel(5);
//        kittie.setFavouriteActivity(Activity.SNOOZE);
//        kittie.setFavouriteFood(catFood);
//        kittie.setHealthLevel(8);
//        kittie.setTypeOfAnimal("cat");
//        System.out.println("My cat's name is: " + kittie.getName() + " she's " + kittie.getBreed() + ". Kitty's favourite activity is to "
//                + kittie.getFavouriteActivity().getName() + " out.");
//        kittie.sleep();
//        kittie.snooze();
//        kittie.speak();
//
//        Veterinary vet = new Veterinary();
//        vet.setName("Bob");
//        vet.setSpecialization("shelter's veterinary");
//        vet.setDayOfWeek("Monday");
//        System.out.println(vet.getName() + " is " + vet.getSpecialization());
//
//        Person person = new Person();
//        person.setName("Billy");
//        person.setMoneyAmount(6000);
//        System.out.println(person.getName() + " has " + person.getMoneyAmount() + " RON in his wallet.");
//
//        Surgeon surgeon = new Surgeon();
//        surgeon.setName("Derek");
//        surgeon.setSpecialization("neurologist");
//        surgeon.setDay("Wednesday");
//        System.out.println(surgeon.getName() + " is a " + surgeon.getSpecialization() + " doctor.");
//
//        Cow cow = new Cow();
//        cow.setName("Bumba");
//        cow.setAge(8);
//        cow.setWeight(80);
//        cow.setColor("chocolate");
//        cow.setHungerLevel(8);
//        cow.eat(20);
//        System.out.println(cow.getName() + " has " + cow.getAge() + " years."
//                + " Her weight is " +cow.getWeight());
//
//
//
//        System.out.println();
//        // story telling
//        Adopter annie = new Adopter();
//        annie.setName("Annie");
//        annie.setMoneyAmount(250);
//
//        annie.rescueAnimal(dog, dogFood);
//        dog.eat(230);
//        annie.feedAnimal(dog, dogFood);
//        annie.goToVet(dog, vet);
//        annie.doExercises(dog);
//
//
//        System.out.println();
//        System.out.println();
//
//        Adopter maria = new Adopter();
//        maria.setName("Maria");
//        maria.setMoneyAmount(300);
//        maria.rescueAnimal(kittie, catFood);
//        kittie.eat(12);
//        maria.feedAnimal(kittie,catFood);
//        maria.goToVet(kittie, vet);
//        maria.doExercises(kittie);
//
//
//    }
//}