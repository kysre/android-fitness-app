package com.example.android_fitness_app.Model.allExercises;

import java.net.URL;

public class SideBend extends Exercise{
    private BodyPart bodyPart = BodyPart.Core;
    private Category category = Category.Dumbbell;
    private String name = "Side Bend (Dumbbell)";
    private String info ="1: Stand up tall with your feet shoulder-width apart." +
            " Hold a dumbbell in your right hand with your palm facing your " +
            "hip and place your left hand behind your head.\n" +
            "2: Bend to your right side, as far as it feels comfortable, and pause.\n" +
            "3: Repeat for the duration of the set, and then switch sides.";
    private URL pictureUrl= getClass().getResource("/Resource/Dumbbell-Side-Bend.jpg");
}
