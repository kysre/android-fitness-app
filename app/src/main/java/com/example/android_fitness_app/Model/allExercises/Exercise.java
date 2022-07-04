package com.example.android_fitness_app.Model.allExercises;

import com.example.android_fitness_app.Model.Set;

import java.net.URL;
import java.util.ArrayList;

public class Exercise {
    private final ArrayList<Set> sets;
    private static ArrayList<Exercise> allExercise=new ArrayList<>();
    private String info;
    private String name;
    private URL imageUrl;

    public Exercise() {
        this.sets = new ArrayList<>();
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public static ArrayList<Exercise> getAllExercise() {
        return allExercise;
    }

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }




}
