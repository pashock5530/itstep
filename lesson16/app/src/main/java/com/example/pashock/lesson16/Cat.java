package com.example.pashock.lesson16;

import android.util.Log;

/**
 * Created by pashock on 15.03.16.
 */
public class Cat extends Animal {

    String Color;

    @Override
    public void Eat() {
        Log.d("Eat", "CAT");
    }

    @Override
    public void Run() {
        Log.d("Run", "CAT");
    }
}
