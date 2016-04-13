package com.example.pashock.lesson19;

import android.util.Log;

/**
 * Created by pashock on 24.03.16.
 */
public class People {

    public final String pi = "3.1415";

    String name;
    String surname;

    People() {

    }

    People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public final void Move() {
        Log.d("m", "move");
    }

}
