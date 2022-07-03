package com.example.android_fitness_app.Model.allExercises;

import java.net.URL;

public class ObliqueCrunch {
    private BodyPart bodyPart = BodyPart.Core;
    private Category category = Category.Reps_only;
    private String name = "Oblique Crunch";
    private String info ="1. Laying on your back with knees bent and feet on the ground, bring your" +
            " hands behind your ears pulling the elbows back. Leave enough space between the chin " +
            "and the chest to fit your fist. Cross one leg over the other, placing the foot on the " +
            "opposite knee.\n" +
            "2. Exhale and begin crunching and twisting the torso across so that the shoulder" +
            " leads towards the opposite knee.\n" +
            "3. Inhale, slowly returning to starting position.Common mistakes: Leading with" +
            " the elbow";
    private URL pictureUrl= getClass().getResource("/Resource/oblique-crunch.gif");
}
