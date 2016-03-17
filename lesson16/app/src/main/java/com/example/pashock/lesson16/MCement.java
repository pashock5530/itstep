package com.example.pashock.lesson16;

/**
 * Created by pashock on 15.03.16.
 */
public class MCement extends Cement {

    private String name;
    private double volume;

    public MCement(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getVolume() {
        return volume;
    }

}
