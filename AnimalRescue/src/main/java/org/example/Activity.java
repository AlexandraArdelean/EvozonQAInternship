package org.example;

import java.util.Objects;

public class Activity {
    private String activityName;

    public Activity(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityName='" + activityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity activity)) return false;
        return Objects.equals(getActivityName(), activity.getActivityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getActivityName());
    }
}
