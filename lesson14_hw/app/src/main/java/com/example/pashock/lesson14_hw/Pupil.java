package com.example.pashock.lesson14_hw;

import android.util.Log;
import android.widget.RelativeLayout;

/**
 * Created by pashock on 06.03.16.
 */
public class Pupil {

    private String name;

    public Pupil() {
        name = "unknown";
    }

    public Pupil(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Study() {
        Log.d("Pupil - study", "unknown");
    }

    public void Read() {
        Log.d("Pupil - read", "unknown");
    }

    public void Write() {
        Log.d("Pupil - write", "unknown");
    }

    public void Relax() {
        Log.d("Pupil - relax", "unknown");
    }

    public void getInfo() {
        Study();
        Read();
        Write();
        Relax();
    }

}
