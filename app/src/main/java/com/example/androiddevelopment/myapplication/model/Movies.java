package com.example.androiddevelopment.myapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 27.10.17..
 */

public class Movies {

    private int id;
    private String name;
    private List<Actor> movies;

    public Movies() {

        movies = new ArrayList<>();
    }

    public Movies(int id, String name) {

        this.id = id;
        this.name = name;

        movies = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Actor> getMovies() {
        return movies;
    }

    public void setMovies(List<Actor> movies) {
        this.movies = movies;
    }

    /*public void addActor(Actor actor) {

        actors.add(actor);
    }

    public void removeActor(Actor actor) {

        actors.remove(actor);
    }

    public Actor getActor(int position) {

        return actors.get(position);
    }*/

}
