package com.example.android_fitness_app.Model;

import java.util.Date;

public class Workout {
    private String name;
    private double volume;
    private Date date;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return (int) volume;
    }

    public String getDateString() {
        // Todo: cast date to string format
        return " ";
    }
}
