package com.example.android_fitness_app.Model;

public class User {
    private static User user;
    private String name;
    private double height;
    private double weight;
    private Sex sex;

    private User() {
        name = "";
        height = 175.0;
        weight = 75.0;
        sex = Sex.MALE;
    }

    public static User getInstance() {
        if (user == null) user = new User();
        return user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public enum Sex {
        MALE,
        FEMALE
    }
}
