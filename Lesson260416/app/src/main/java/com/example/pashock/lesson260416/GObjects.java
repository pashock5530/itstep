package com.example.pashock.lesson260416;

import java.util.HashMap;

/**
 * Created by pashock on 27.04.16.
 */
public class GObjects {

    private HashMap<Integer, GObject> objects;

    private int left = 90;

    public GObjects() {
        objects = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            //left = (int) (Math.random()*90+1);
            objects.put(i, new GObject(i * left));
        }
    }

    public GObject getObject(int i) {
        return objects.get(i);
    }

    public void setObject(Integer i) {
        //left = (int) (Math.random()*90+1);
        objects.put(i, new GObject(i * left));
    }

}
