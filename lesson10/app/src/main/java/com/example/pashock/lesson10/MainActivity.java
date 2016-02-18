package com.example.pashock.lesson10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMax(View view) {
        int[] a = {1, 7, 5, 6, 9, 4, 3, 6, 0, 2};
        maxInArray(a, 9);
    }

    void maxInArray(int[] a) {
        int result = maxInArray(a, a[0], 0);
        Log.d("max", String.valueOf(result));
    }

    void maxInArray(int[] a, int i) {
        int result = maxInArray(a, a[i-1], i);
        Log.d("max", String.valueOf(result));
    }

    int maxInArray(int[] a, int x, int i) {
        if (i < a.length) {
            if (x < a[i]) {
                x = a[i];
            }
            return maxInArray(a, x, i+1);
        } else {
            return x;
        }
    }

    public void onClickMin(View view) {
        int[] a = {1, 7, 5, 6, 9, 4, 3, 6, 0, 2};
        minInArray(a);
    }

    void minInArray(int[] a) {
        int result = minInArray(a, a[0], 0);
        Log.d("min", String.valueOf(result));
    }

    void minInArray(int[] a, int i) {
        int result = minInArray(a, a[i - 1], i);
        Log.d("min", String.valueOf(result));
    }

    int minInArray(int[] a, int x, int i) {
        if (i < a.length) {
            if (x > a[i]) {
                x = a[i];
            }
            return minInArray(a, x, i + 1);
        } else {
            return x;
        }
    }

    public void onClickIndex(View view) {
        int[] a = {1, 7, 2, 6, 2, 4, 3, 6, 0, 2};
        int[] b = IndexInArray(a, 2);
        Log.d("index", Arrays.toString(b));
    }

    int[] IndexInArray(int[] a, int x) {
        int[] b = {};
        return IndexInArray(a, x, 0, 0, b);
    }

    int[] IndexInArray(int[] a, int x, int i) {
        int[] b = {};
        return IndexInArray(a, x, i, 0, b);
    }

    int[] IndexInArray(int[] a, int x, int i, int col, int[] request) {
        if (i < a.length) {
            if (x == a[i]) {
                col++;
                int[] request2 = newArray(request, col, i);
                return IndexInArray(a, x, i + 1, col, request2);
            } else {
                return IndexInArray(a, x, i + 1, col, request);
            }
        } else {
            return request;
        }
    }

    int[] newArray(int[] a, int col, int i) {
        int[] request2 = new int[col];
        for (int z = 0; z < request2.length-1; z++) {
            request2[z] = a[z];
        }
        if (col > 0) {
            request2[col - 1] = i;
        }
        return request2;
    }

}
