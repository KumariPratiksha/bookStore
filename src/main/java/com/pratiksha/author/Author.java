package com.pratiksha.author;

public class Author {
    private String name;
    private int age ;
    private String gender;
    private float rating;

    public Author(String name, int age, String gender, float rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
