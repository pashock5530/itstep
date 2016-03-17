package com.example.pashock.lesson17;

import android.util.Log;

/**
 * Created by pashock on 17.03.16.
 */
class Test2 implements IPeople {

    @Override
    public void write() {
        Log.d("Test2", String.valueOf(a));
    }

    @Override
    public void speak() {

    }

    @Override
    public void think() {

    }
}
