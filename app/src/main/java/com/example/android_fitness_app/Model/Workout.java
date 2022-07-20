package com.example.android_fitness_app.Model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class Workout {
    private final static ArrayList<Workout> workouts;
    private final LinkedHashMap<String, ArrayList<ExerciseSet>> exercises;
    private String name;
    private final LocalDateTime workoutDateTime;

    static {
        workouts = new ArrayList<>();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Workout() {
        this.exercises = new LinkedHashMap<>();
        this.workoutDateTime = LocalDateTime.now();
        this.name = getDefaultWorkoutName(workoutDateTime);
        workouts.add(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private String getDefaultWorkoutName(LocalDateTime workoutDateTime) {
        DateTimeFormatter workoutDateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
        return workoutDateTime.format(workoutDateTimeFormatter) + " Workout";
    }

    public void addSet(String exerciseName, ExerciseSet exerciseSet) {
        if (!exercises.containsKey(exerciseName)) {
            exercises.put(exerciseName, new ArrayList<>());
        }
        exercises.get(exerciseName).add(exerciseSet);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        double volume = 0;
        Set<String> keys = exercises.keySet();
        for (String key : keys) {
            ArrayList<ExerciseSet> exerciseSets = exercises.get(key);
            for (ExerciseSet set : exerciseSets) {
                volume += set.getVolume();
            }
        }
        return (int) volume;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getDateString() {
        DateTimeFormatter workoutDateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd");
        return workoutDateTime.format(workoutDateTimeFormatter);
    }
}
