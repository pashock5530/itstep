package com.example.pashock.lesson9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //temp0(0);
        //temp1(0);
        //temp2(1);
    }

    public void onClick(View view) {
        temp0(0);
        temp1(1);
        temp2(5);
    }

    //перегрузка
    int calc(int a) {
        return a + 1;
    }

    int calc(int a, int b) {
        return a + b;
    }

    //рекурсия
    void recurs(int i) {
        Log.d("recurs", String.valueOf(i));
        if (i == 3) {
            return;
        } else {
            recurs(i+=1);
        }
        Log.d("recurs", String.valueOf(i));
    }

    //%2
    void temp0(int i) {
        if (i == 10) {
            return;
        }
        if (i % 2 != 0) {
            Log.d("temp0", String.valueOf(i));
        }
        temp0(i+=1);
    }

    //%3
    void temp1(int i) {
        if (i == 10) {
            return;
        }
        if (i % 3 == 0) {
            Log.d("temp1", String.valueOf(i));
        }
        temp1(i+=1);
    }

    //факториал
    int temp2(int i) {
        int a;
        if (i == 1) {
            a = 1;
        } else {
            a = i * temp2(i-=1);
        }
        Log.d("temp2", String.valueOf(a));
        return a;
    }
}
