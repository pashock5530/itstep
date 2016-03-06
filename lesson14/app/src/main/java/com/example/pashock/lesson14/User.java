package com.example.pashock.lesson14;

import android.util.Log;

/**
 * Created by pashock on 03.03.16.
 */
public class User {

    private Gun gun;

    public User(Gun gun) {
        this.gun = gun;
    }

    public void shot() {
        gun.shot();
    }

}
