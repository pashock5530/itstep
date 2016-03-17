package com.example.pashock.lesson16;

/**
 * Created by pashock on 15.03.16.
 */
public abstract class Factory {

    /*Macadam macadam;

    Cement cement;

    public Factory() {
        macadam = null;
    }

    public Factory(Macadam macadam) {
        this.macadam = macadam;
    }*/

    public abstract void setMacadam(Macadam macadam);

    public abstract void realizeCement();

    public abstract Cement getCement();

}
