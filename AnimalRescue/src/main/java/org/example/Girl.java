package org.example;

public class Girl extends AnimalRescuer {

    public Girl() {
    }

    @Override
    public void rescueAnimal(Animal animal, AnimalFood animalFood) {
        System.out.println(getName() + " went one day with her dad to the dog shelter. She saw a dog who was looking " +
                "like a " + animal.getBreed() + " and fell in love.");
        System.out.println(getName() + " named him " + animal.getName() + ".");
        System.out.println(animal.getName() + " was very unhappy, weak and refused to eat.");
        if (animal.getSpiritMood() > 0) {
            System.out.println(getName() + " rescued " + animal.getName() + " from shelter and bought "
                    + animalFood.getName() + " which is dog's favourite type of food.");

        } else {
            System.out.println(getName() + " played " + Activity.BALL + " and promised to return the next day.");
        }
    }

    @Override
    public void feedAnimal(Animal animal, AnimalFood animalFood) {
        System.out.println(animal.getName() + " was very shy at first, but " + getName() + " gave dog's favourite food (" +
                animalFood.getName() + ") and everything was better.");
        System.out.println("After a while " + animal.getName() + " gained weight and started to play more with "
                + getName() + ".");
        System.out.println(animal.getName() + "'s new weight is: " + animal.getWeight());
        System.out.println("The hunger level is at: " + animal.getHungerLevel()
                + " and spirit mood is at " + animal.getSpiritMood() + " which is an improvement from the first day.");
    }


    @Override
    public void goToVet(Animal animal, Doctor doctor) {
        System.out.println("One day " + getName() + " and " + animal.getName() + " went to "
                + doctor.getName() + ", the " + doctor.getSpecialization()
                + " and asked if " + animal.getName() + " needs vaccines.");
        doctor.givesConsult();

        if (animal.getAge() > 0) {
            System.out.println(animal.getName() + " needs to do the annual vaccines. ");
        }
        if (animal.getHealthLevel() >= 1) {
            System.out.print("After the checkup was done, " + doctor.getName() + " said that everything is ok and ");
            System.out.println(getName() + " can go to park and play " + Activity.BALL.getName() + " with " + animal.getName() + ".");
        }

    }

    @Override
    public void doExercises(Animal animal) {

        if (animal.getWeight() > 15) {
            System.out.println("In time, " + animal.getName() + " gained too much weight and " + getName() + " had to change the food with " +
                    "something lighter.");
            System.out.println(getName() + " and " + animal.getName() + " went to park every day and played " +
                    Activity.BALL.getName() + ". During the day " + getName() + " did her homeworks and " +
                    animal.getName() + " slept near her.");
            animal.sleep();
            System.out.println("After " + animal.getName() + "'s sleep was over, they went to the garden and played " +
                    Activity.BALL.getName() + ". In the evening they went for a walk again.");
        }


    }

}
