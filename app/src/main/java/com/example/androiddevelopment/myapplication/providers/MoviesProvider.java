package com.example.androiddevelopment.myapplication.providers;

import com.example.androiddevelopment.myapplication.model.Actor;
import com.example.androiddevelopment.myapplication.model.Movies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 27.10.17..
 */

public class MoviesProvider {

    public static List<Actor> getMovies() {

        Actor tomHanks = new Actor(0, "Tom Hanks");
        Actor bradPitt = new Actor(1, "Brad Pitt");
        Actor leonardoDiCaprio = new Actor(2, "Leonardo DiCaprio");
        Actor edwardNorton = new Actor(3, "Edward Norton");

        ArrayList<Movies> tomHanks = new ArrayList<>();
        tomHanks.add(new Movies(0, "Forest Gump"));
        tomHanks.add(new Movies(1, "The Terminal"));
        tomHanks.add(new Movies(2, "Saving Private Ryan"));
        tomHanks.add(new Movies(3, "Sully"));

        ArrayList<Movies> bradPitt = new ArrayList<>();
        bradPitt.add(new Movies(0, "Snatch"));
        bradPitt.add(new Movies(1, "Fight Club"));
        bradPitt.add(new Movies(2, "Seven"));
        bradPitt.add(new Movies(3, "Twelve monkeys"));

        ArrayList<Movies> leonardoDiCaprio = new ArrayList<>();
        leonardoDiCaprio.add(new Movies(0, "The Revemamt"));
        leonardoDiCaprio.add(new Movies(1, "Django Unchained"));
        leonardoDiCaprio.add(new Movies(2, "The Departed"));
        leonardoDiCaprio.add(new Movies(3, "The Wolf of Wall Street"));

        ArrayList<Movies> edwardNorton = new ArrayList<>();
        edwardNorton.add(new Movies(0, "The Hulk"));
        edwardNorton.add(new Movies(1, "American History X"));
        edwardNorton.add(new Movies(2, "Fight Club"));
        edwardNorton.add(new Movies(3, "Birdman"));

        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor(0, "tomhanks.jpg", "Tom Hanks", "biography...", 5.0f, tomHanks, "7.9.1956."));
        actors.add(new Actor(1, "bradpitt.jpg", "Brad Pitt", "biography...", 4.0f, bradPitt, "12.18.1963."));
        actors.add(new Actor(2, "leonardodicaprio.jpg", "Leonardo DiCaprio", "biography...", 5.0f, leonardoDiCaprio, "11.11.1974."));
        actors.add(new Actor(3, "edwardnorton.jpg", "Edward Norton", "biography...", 4.0f, edwardNorton, "8.18.1969."));
        return actors;
    }

    public static List<String> getMoviesNames() {

        List<String> names = new ArrayList<>();
        names.add("Forest Gump");
        names.add("The Terminal");
        names.add("Saving Private Ryan");
        names.add("Sully");
        names.add("Snatch");
        names.add("Fight Club");
        names.add("Seven");
        names.add("Twelve monkeys");
        names.add("The Revenant");
        names.add("Django Unchained");
        names.add("The Departed");
        names.add("The Wolf of Wall Street");
        names.add("The Hulk");
        names.add("American History X");
        names.add("Fight Club");
        names.add("Birdman");
        return names;
    }

    public static Movies getMoviesById(int id) {

        Actor tomHanks = new Actor(0, "Tom Hanks");
        Actor bradPitt = new Actor(1, "Brad Pitt");
        Actor leonardoDiCaprio = new Actor(2, "Leonardo DiCaprio");
        Actor edwardNorton = new Actor(3, "Edward Norton");

        ArrayList<Movies> tomHanks = new ArrayList<>();
        tomHanks.add(new Movies(0, "Forest Gump"));
        tomHanks.add(new Movies(1, "The Terminal"));
        tomHanks.add(new Movies(2, "Saving Private Ryan"));
        tomHanks.add(new Movies(3, "Sully"));

        ArrayList<Movies> bradPitt = new ArrayList<>();
        bradPitt.add(new Movies(0, "Snatch"));
        bradPitt.add(new Movies(1, "Fight Club"));
        bradPitt.add(new Movies(2, "Seven"));
        bradPitt.add(new Movies(3, "Twelve monkeys"));

        ArrayList<Movies> leonardoDiCaprio = new ArrayList<>();
        leonardoDiCaprio.add(new Movies(0, "The Revemamt"));
        leonardoDiCaprio.add(new Movies(1, "Django Unchained"));
        leonardoDiCaprio.add(new Movies(2, "The Departed"));
        leonardoDiCaprio.add(new Movies(3, "The Wolf of Wall Street"));

        ArrayList<Movies> edwardNorton = new ArrayList<>();
        edwardNorton.add(new Movies(0, "The Hulk"));
        edwardNorton.add(new Movies(1, "American History X"));
        edwardNorton.add(new Movies(2, "Fight Club"));
        edwardNorton.add(new Movies(3, "Birdman"));

        switch (id) {
            case 0:
                return new Actor(0, "tomhanks.jpg", "Tom Hanks", "biography...", 5.0f, tomHanks, "7.9.1956.");
            case 1:
                return new Actor(1, "bradpitt.jpg", "Brad Pitt", "biography...", 4.0f, bradPitt, "12.18.1963.");
            case 2:
                return new Actor(2, "leonardodicaprio.jpg", "Leonardo DiCaprio", "biography...", 5.0f, leonardoDiCaprio, "11.11.1974.");
            case 3:
                return new Actor(3, "edwardnorton.jpg", "Edward Norton", "biography...", 4.0f, edwardNorton, "8.18.1969.");
            default:
                return null;
        }

    }

}
