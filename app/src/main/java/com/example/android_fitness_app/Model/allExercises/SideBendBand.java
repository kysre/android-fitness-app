package com.example.android_fitness_app.Model.allExercises;

import java.net.URL;

public class SideBendBand {
    private BodyPart bodyPart = BodyPart.Core;
    private Category category = Category.Machine;
    private String name = "Side Bend (Band)";
    private String info ="1: Secure band to an elevated object so that it is taunt at shoulder level" +
            "and hold the handle in the left hand.\n" +
            "2: Bend the torso and contract the obliques while exhaling.\n" +
            "3: Return slowly to the starting position while inhaling.\n" +
            "4: Repeat for reps.";
    private URL pictureUrl= getClass().getResource("/Resource/Side-Bend-Band.jpg");
}
