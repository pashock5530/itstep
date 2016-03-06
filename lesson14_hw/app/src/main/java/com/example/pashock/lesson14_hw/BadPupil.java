package com.example.pashock.lesson14_hw;

import android.util.Log;

/**
 * Created by pashock on 06.03.16.
 */
public class BadPupil extends Pupil {

    private String name;

    public BadPupil() {
        name = "unknown";
    }

    public BadPupil(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Study() {
        Log.d("BadPupil - study", "bad");
    }

    @Override
    public void Read() {
        Log.d("BadPupil - read", "bad");
    }

    @Override
    public void Write() {
        Log.d("BadPupil - write", "bad");
    }

    @Override
    public void Relax() {
        Log.d("BadPupil - relax", "bad");
    }

    @Override
    public void getInfo() {
        Study();
        Read();
        Write();
        Relax();
    }

}
