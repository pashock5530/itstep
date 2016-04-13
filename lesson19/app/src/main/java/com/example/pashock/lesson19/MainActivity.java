package com.example.pashock.lesson19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        People people = new People("Pavel", "Milkevych");
        Log.d("pi", people.pi);

        User user = new User();
        Log.d("pi",user.pi);

        Switch s = new Switch(220, "p", "in");
        s.on();

    }
}
