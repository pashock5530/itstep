package com.example.pashock.lesson16;

/**
 * Created by pashock on 15.03.16.
 */
public class MMacadam extends Macadam {

    private String name;
    private double volume;
    private double percent;

    public MMacadam(String name, double volume, double percent) {
        this.name = name;
        this.volume = volume;
        this.percent = percent;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public double getPercent() {
        return percent;
    }
}
