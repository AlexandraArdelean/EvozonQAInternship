package org.example;


public class Veterinary extends Doctor {
    private String dayOfWeek;

    public Veterinary() {
    }

    public Veterinary(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void givesConsult(String day) {
        if (getDayOfWeek().equalsIgnoreCase("Friday")) {
            System.out.println("My work days are from Monday to Thursday! See you on Monday morning! :)");

        } else {
            System.out.println("Meet me at the office!");
        }

    }


    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
