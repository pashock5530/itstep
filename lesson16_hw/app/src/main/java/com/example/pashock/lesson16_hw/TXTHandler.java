package com.example.pashock.lesson16_hw;

import android.util.Log;

/**
 * Created by pashock on 15.03.16.
 */
public class TXTHandler extends AbstractHandler {

    private final String type = "TXT";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void Open() {
        Log.d(type, "Open");
    }

    @Override
    public void Create() {
        Log.d(type, "Create");
    }

    @Override
    public void Change() {
        Log.d(type, "Change");
    }

    @Override
    public void Save() {
        Log.d(type, "Save");
        Log.d(type, "Save");
    }
}
