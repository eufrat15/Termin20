package com.example.androiddevelopment.myapplication.providers;

import com.example.androiddevelopment.myapplication.model.Actor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by androiddevelopment on 27.10.17..
 */

public class ActorProvider {

    public static List<Actor> getActors() {

        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor(0, "Tom Hanks"));
        actors.add(new Actor(1, "Brad Pitt"));
        actors.add(new Actor(2, "Leonardo DiCaprio"));
        actors.add(new Actor(3, "Edward Norton"));
        return  actors;
    }

    public static List<String> getActorNames() {
        List<String> names = new ArrayList<>();
        names.add("Tom Hanks");
        names.add("Brad Pitt");
        names.add("Leonardo DiCaprio");
        names.add("Edward Norton");
        return names;
    }

    public static Actor getActorById(int id) {
        switch (id) {
            case 0:
                return new Actor(0, "Tom Hanks");
            case 1:
                return new Actor(1, "Brad Pitt");
            case 2:
                return new Actor(2, "Leonardo DiCaprio");
            case 3:
                return new Actor(3, "Edward Norton");
            default:
                return null;
        }
    }
}
