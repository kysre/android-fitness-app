package com.example.android_fitness_app.Model;

import com.example.android_fitness_app.Model.allExercises.Exercise;

import java.util.ArrayList;

public class Workout {
    private final ArrayList<Exercise> exercises;

    public Workout() {
        this.exercises = new ArrayList<>();
    }
}
