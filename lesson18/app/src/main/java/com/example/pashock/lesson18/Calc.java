package com.example.pashock.lesson18;

import android.util.Log;

import java.util.Collection;

/**
 * Created by pashock on 22.03.16.
 */
public class Calc {

    public static int count;

    public Calc() {
        Log.d("Calc", String.valueOf(count));

        Log.d("Calc", "Calc()");
    }

    public static void show() {
        count += 10;

        Log.d("Calc", String.valueOf(count));

        Log.d("Calc", "show()");
    }

}
