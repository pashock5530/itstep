package com.example.pashock.lesson17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * строй-материалы
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IPeople t = new Test();

        Test t1 = new Test();
        t1.write();

        Test2 t2 = new Test2();
        t2.write();

    }
}
