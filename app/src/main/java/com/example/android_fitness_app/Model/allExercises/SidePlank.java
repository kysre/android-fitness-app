package com.example.android_fitness_app.Model.allExercises;

import java.net.URL;

public class SidePlank {
    private BodyPart bodyPart = BodyPart.Core;
    private Category category = Category.Duration;
    private String name = "Side Plank";
    private String info ="1: Lie on your right side with your legs straight and feet stacked" +
            " on top of each other. Place your right elbow under your right shoulder with your" +
            " forearm pointing away from you and your hand balled into a fist. The pinky side of" +
            " your hand should be in contact with the ground.\n" +
            "2: With your neck neutral, breathe out and brace your core.\n" +
            "3: Lift your hips off the mat so that you’re supporting your weight on your elbow " +
            "and the side of your right foot. Your body should be in a straight line from your " +
            "ankles to your head.\n" +
            "4: Hold this position for the duration of the exercise. Depending on your fitness" +
            " level, aim for between 15 to 60 seconds.\n" +
            "5: Repeat on your left side.";
    private URL pictureUrl= getClass().getResource("/Resource/Side-Plank.jpg");
}
