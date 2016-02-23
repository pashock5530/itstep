package com.example.pashock.lesson11;

/**
 * Классы
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    TextView text;

    int col = 2;
    int i = 0;

    People peoples[] = new People[col];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int j = 0; j < peoples.length; j++) {
            peoples[j] = null;
        }

        userName = (EditText) findViewById(R.id.editText);
    }

    public void onClick1(View view) {
        People people = new People();
        people.setName(userName.getText().toString());
        peoples[i++] = people;

        if (i+1 > col) {
            newArray();
        }

        userName.setText("");
    }

    public void newArray() {
        col += col;
        People temp[] = new People[col];
        int t = peoples.length;
        for (int j = 0; j < t; j++) {
            temp[j] = peoples[j];
        }
        peoples = new People[col];
        for (int j = 0; j < t; j++) {
            peoples[j] = temp[j];
        }
        for (int j = t; j < peoples.length; j++) {
            peoples[j] = null;
        }
    }

    public void onClick2(View view) {
        text = (TextView) findViewById(R.id.textView);
        text.setText("");
        for (People j:peoples) {
            if (j != null) {
                text.append(j.getName()+" ");
            } else {
                break;
            }
        }
    }

}
