package org.example;

import java.util.Objects;

public class Surgeon extends Doctor{
    private String day;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public void givesConsult(String day) {
        if (day.equals("Monday")){
            System.out.println("Not in the office!");
        } else if (day.equals("Tuesday")){
            System.out.println("On the field!");
        }else {
            System.out.println("Come to the cabinet for a consult!");
        }
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "day='" + day + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Surgeon surgeon)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getDay(), surgeon.getDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDay());
    }
}
