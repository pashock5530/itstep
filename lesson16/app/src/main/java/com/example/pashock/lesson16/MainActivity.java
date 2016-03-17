package com.example.pashock.lesson16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal dog = new Dog();
        dog.Eat();

        //Цементный завод
        Macadam macadam = new MMacadam("newMacadam", 2000, 10);
        Factory factory = new CFactory(macadam);
        Cement cement = factory.getCement();

        Log.d("Cement", cement.getName() + ": " + String.valueOf(cement.getVolume()));

    }
}
