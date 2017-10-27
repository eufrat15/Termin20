package com.example.androiddevelopment.myapplication.model;


import java.util.Date;

/**
 * Created by androiddevelopment on 27.10.17..
 */

public class Actor {

    private int id;
    private String image;
    private String name;
    private String biography;
    private float rating;
    private Movies movies;
    private Date dateOfBirth;

    public Actor() {

    }

    public Actor(int id, String image, String name, String biography, float rating, Movies movies, Date dateOfBirth) {

        this.id = id;
        this.image = image;
        this.name = name;
        this.biography = biography;
        this.rating = rating;
        this.movies = movies;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return name;
    }
}
