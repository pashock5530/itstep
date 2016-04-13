package com.example.pashock.lesson18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calc calc = new Calc();
        Calc.count = 10;
        Calc.show();

        Calculatron cl = new Calculatron();
        Calculatron.Calculate.b = 100;
        Calculatron.Calculate a = new Calculatron.Calculate();
        a.showTemp();

    }
}
