package com.example.pashock.lesson14;

import android.util.Log;

/**
 * Created by pashock on 03.03.16.
 */
public class Ak47 extends Gun {

    public String name = "Ak-47";

    public Ak47() {

    }

    public Ak47(String name) {

    }

    @Override
    public void shot() {
        Log.d("Ak47", "Пифпаф");
    }

}
