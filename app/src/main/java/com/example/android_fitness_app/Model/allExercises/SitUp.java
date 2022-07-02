package com.example.android_fitness_app.Model.allExercises;

import java.net.URL;

public class SitUp {
    private BodyPart bodyPart = BodyPart.Core;
    private Category category = Category.Reps_only;
    private String name = "Sit Up";
    private String info ="1: Lie face-up on the floor. Bend your knees so your feet are flat on the" +
            " floor. Plant your feet firmly, tucking them under a bench or some sort of other brace " +
            "if you have to. If you have a partner, you can have them hold your feet down " +
            "(it’s worth noting that the ideal way to perform sit-ups is without a foot brace—you" +
            " may want to work on strengthening your core until you get to that point before " +
            "attempting sit-ups, for optimal results). \n" +
            "2: Cross your arms over your chest. Your left hand should rest on your right shoulder" +
            " and vice versa. Don’t put your hands behind your head, as this can cause you to " +
            "pull on your neck. \n" +
            "3: Engage your core. To do so, take a deep breath and think of drawing your belly" +
            " button to your spine. Your core should be fully engaged before you start your" +
            " first rep. \n" +
            "4: Use your ab muscles to lift your back off of the ground. Your tailbone and hips" +
            " should remain static and pressed into the floor until you’re fully upright. It may " +
            "help to think about lifting one vertebra at a time, rather than lifting your entire " +
            "back all at once. This is where the sit-up gets its other names, curl-up and " +
            "roll-up—picture yourself curling up one back bone at a time, until you’re sitting all " +
            "the way up. \n" +
            "5: With immense control, lower yourself back to the starting position. This time, " +
            "picture yourself uncurling one vertebrae at a time, starting with your lower back. " +
            "Do not thud into the floor. \n" +
            "6: Once you’re lying face-up again, re-engage your core to start another rep. " +
            "Repeat until you finish your set. ";
    private URL pictureUrl= getClass().getResource("/Resource/Sit-Up.jpg");
}
