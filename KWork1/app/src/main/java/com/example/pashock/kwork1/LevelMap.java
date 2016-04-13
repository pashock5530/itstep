package com.example.pashock.kwork1;

import java.util.HashMap;

/**
 * Created by pashock on 12.04.16.
 */
public class LevelMap implements ILevelMap {

    private HashMap<Integer, Level> map = new HashMap<>();

    public LevelMap() {
        map.put(1, new Level(1, 5, 1, "mouse", "img1.jpg", "img2.jpg", "img3.jpg", "img4.jpeg"));
        map.put(2, new Level(2, 10, 2, "nokia", "img1.jpg", "img2.jpg", "img3.jpg", "img4.jpg"));
    }

    @Override
    public Level getLevel(int id) {
        if (map.containsKey(id)) {
            return map.get(id);
        }
        return null;
    }

    @Override
    public int getCount() {
        return map.size();
    }

}
