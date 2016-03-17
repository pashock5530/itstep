package com.example.pashock.lesson16;

/**
 * Created by pashock on 15.03.16.
 */
public class CFactory extends Factory {

    Macadam macadam;

    Cement cement;

    public CFactory(Macadam macadam) {
        this.macadam = macadam;
        cement = null;
    }

    @Override
    public void setMacadam(Macadam macadam) {
        this.macadam = macadam;
    }

    @Override
    public void realizeCement() {
        cement = new MCement("newCement", macadam.getVolume() * (macadam.getPercent() / 100));
    }

    @Override
    public Cement getCement() {
        realizeCement();
        return cement;
    }
}
