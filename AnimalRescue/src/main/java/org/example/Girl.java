package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Girl extends AnimalRescuer {
    private Animal animal;
    private AnimalFood animalFood;
    private Activity activity;
    private Veterinary veterinary;

    public Girl() {
    }

    public Girl(String name, int moneyAmount) {
        super(name, moneyAmount);
    }

    AnimalFood dogFavFood = new AnimalFood("Acana Red Meat", 380, 15,
            LocalDate.of(2025, 11, 30), "enough for a month");
    Veterinary vet = new Veterinary("Bob", "shelter's veterinary doctor");
    Dog dog = new Dog("Rex", 5, 3, 10, 2,
            dogFavFood, Activity.FETCH, 15, "brown", "labrador");


    @Override
    public void rescueAnimal() {
        System.out.println(getName() + " went one day with her dad to the dog shelter. She saw a dog who was looking " +
                "like a " + dog.getBreed() + " and fell in love with him.");
        System.out.println(getName() + " named him " + dog.getName() + ".");
        System.out.println(dog.getName() + " was very unhappy, weak and refused to eat.");
        if (dog.getSpiritMood() > 0) {
            System.out.println(getName() + " rescued " + dog.getName() + " from shelter and bought "
                    + dogFavFood.getName() + " which is his favourite type of food.");
            dog.eat(150);

        } else {
            System.out.println(getName() + " played " + Activity.BALL + " and promised to return the next day.");
        }
    }

    @Override
    public void feedAnimal() {
        System.out.println(dog.getName() + " was very shy at first, but " + getName() + " fed him his favourite food (" +
                dogFavFood.getName() + ").");
        System.out.println("After a while " + dog.getName() + " gained weight and started to play more with "
                + getName() + ".");
        System.out.println(dog.getName() + " new weight is: " + dog.getWeight());
        System.out.println("The hunger level is at: " + dog.getHungerLevel()
                + " and spirit mood is at " + dog.getSpiritMood() + " which is an improvement from the first day.");
    }


    @Override
    public void goToVet() {
        System.out.println("One day " + getName() + " and " + dog.getName() + " went to "
                + vet.getName() + ", the " + vet.getSpecialization()
                + " and asked if " + dog.getName() + " needs vaccines.");
        vet.givesConsult();

        if (dog.getAge() > 0) {
            System.out.println(dog.getName() + " needs to do the annual vaccines. ");
        }
        if (dog.getHealthLevel() >= 1) {
            System.out.print("After the checkup was done, " + vet.getName() + " said that everything is ok and ");
            System.out.println(getName() + " can go to park and play " + Activity.BALL.getName() + " with " + dog.getName() + ".");
        }

    }

    @Override
    public void doExercises() {

        if (dog.getWeight() > 15) {
            System.out.println("In time, " + dog.getName() + " gained too much weight and " + getName() + " had to change his food with " +
                    "something lighter.");
            System.out.println(getName() + " and " + dog.getName() + " went to park every day and played " +
                    Activity.BALL.getName() + ". During the day " + getName() + " did her homeworks and " +
                    dog.getName() + " slept near her.");
            dog.sleep();
            System.out.println("After " + dog.getName() + "'s sleep was over, they went to the garden and played " +
                    Activity.BALL.getName() + ". In the evening they went for a walk again.");
        }


    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public AnimalFood getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(AnimalFood animalFood) {
        this.animalFood = animalFood;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Veterinary getVeterinary() {
        return veterinary;
    }

    public void setVeterinary(Veterinary veterinary) {
        this.veterinary = veterinary;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "animal=" + animal +
                ", animalFood=" + animalFood +
                ", activity=" + activity +
                ", veterinary=" + veterinary +
                ", rexFavFood=" + dogFavFood +
                ", vet=" + vet +
                ", rex=" + dog +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Girl girl)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getAnimal(), girl.getAnimal())
                && Objects.equals(getAnimalFood(), girl.getAnimalFood())
                && getActivity() == girl.getActivity()
                && Objects.equals(getVeterinary(), girl.getVeterinary())
                && Objects.equals(dogFavFood, girl.dogFavFood)
                && Objects.equals(vet, girl.vet) && Objects.equals(dog, girl.dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAnimal(), getAnimalFood(), getActivity(), getVeterinary(), dogFavFood, vet, dog);
    }
}
