package com.example.pashock.lesson190416;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    public void test() {
        HashSet<People> peoples = new HashSet<>();

        People p = new People("Pavel", 20);
        People p2 = new People("Pavel", 14);

        People copy_p = new People("Pavel", 20);


        People copy1 = new People("Pavel", 20);

        peoples.add(p);
        peoples.add(p2);
        peoples.add(copy_p);

        if (p == copy_p) {
            Log.d("1", "Pavel2");
        } else {
            Log.d("2", "Pavel1");
        }
    }
}
