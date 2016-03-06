package com.example.pashock.lesson14_hw;

import android.util.Log;

/**
 * Created by pashock on 06.03.16.
 */
public class ExcelentPupil extends Pupil {

    private String name;

    public ExcelentPupil() {
        name = "unknown";
    }

    public ExcelentPupil(String name) {
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
        Log.d("ExcelentPupil - study", "excel");
    }

    @Override
    public void Read() {
        Log.d("ExcelentPupil - read", "excel");
    }

    @Override
    public void Write() {
        Log.d("ExcelentPupil - write", "excel");
    }

    @Override
    public void Relax() {
        Log.d("ExcelentPupil - relax", "excel");
    }

    @Override
    public void getInfo() {
        Study();
        Read();
        Write();
        Relax();
    }

}
