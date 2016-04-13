package com.example.pashock.lesson18;

import android.util.Log;

/**
 * Created by pashock on 22.03.16.
 */
public class Calculatron {

    public int a = 0;

    static class Calculate {

        static int b = 10;

        public static void show() {
            Log.d("Calculate", "123");
        }

        public void showTemp() {
            Log.d("Calculate", String.valueOf(b));
        }
    }

}
