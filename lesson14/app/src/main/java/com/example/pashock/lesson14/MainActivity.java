package com.example.pashock.lesson14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User(new Ak47());
        user.shot();
        user = new User(new Pistol());
        user.shot();
    }
}
