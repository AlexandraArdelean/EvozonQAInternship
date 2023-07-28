package org.example;

public enum Activity {
    BALL("ball"),
    FETCH("fetch"),
    RUNNING("running"),
    SNOOZE("snooze");
    public final String name;

    private Activity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
