package com.example.android_fitness_app.Model;

public class Set {
    private int reps;
    private double weight;

    public Set() {
        this.reps = 0;
        this.weight = 0;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
