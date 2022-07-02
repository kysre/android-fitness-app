package com.example.android_fitness_app.Model.allExercises;

import java.net.URL;

public class Plank {
    private BodyPart bodyPart = BodyPart.Core;
    private Category category = Category.Duration;
    private String name = "Plank";
    private String info ="1: Begin in the plank position, face down with your forearms and toes " +
            "on the floor. Your elbows are directly under your shoulders and your forearms are " +
            "facing forward. Your head is relaxed and you should be looking at the floor.\n" +
            "2: Engage your abdominal muscles, drawing your navel toward your spine. Keep your torso " +
            "straight and rigid and your body in a straight line from your ears to your toes with no" +
            " sagging or bending. This is the neutral spine position. Ensure your shoulders are " +
            "down, not creeping up toward your ears. Your heels should be over the balls of your " +
            "feet.\n" +
            "3: Hold this position for 10 seconds. Release to floor.\n" +
            "4: Over time work up to 30, 45, or 60 seconds.";
    private URL pictureUrl= getClass().getResource("/Resource/Plank.jpg");
}
