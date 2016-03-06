package com.example.pashock.lesson14_hw;

import android.util.Log;

/**
 * Created by pashock on 06.03.16.
 */
public class GoodPupil extends Pupil {

    private String name;

    public GoodPupil() {
        name = "unknown";
    }

    public GoodPupil(String name) {
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
        Log.d("GoodPupil - study", "good");
    }

    @Override
    public void Read() {
        Log.d("GoodPupil - read", "good");
    }

    @Override
    public void Write() {
        Log.d("GoodPupil - write", "good");
    }

    @Override
    public void Relax() {
        Log.d("GoodPupil - relax", "good");
    }

    @Override
    public void getInfo() {
        Study();
        Read();
        Write();
        Relax();
    }

}
