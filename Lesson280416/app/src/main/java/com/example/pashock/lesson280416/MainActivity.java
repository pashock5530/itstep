package com.example.pashock.lesson280416;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    LinkedList<People> peoples;

    TextView name;
    TextView sname;
    TextView male;

    TextView fName;
    TextView fSname;
    TextView fMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peoples = new LinkedList<>();

        name = (TextView) findViewById(R.id.editText);
        sname = (TextView) findViewById(R.id.editText2);
        male = (TextView) findViewById(R.id.editText3);

        fName = (TextView) findViewById(R.id.editText4);
        fSname = (TextView) findViewById(R.id.editText5);
        fMale = (TextView) findViewById(R.id.editText6);

    }

    public void onAddClick(View view) {
        if (peoples.size() == 0) {
            peoples.add(new People(
                    name.getText().toString(),
                    sname.getText().toString(),
                    male.getText().toString()));
        } else {
            Collections.reverse(peoples);
            peoples.add(new People(
                    name.getText().toString(),
                    sname.getText().toString(),
                    male.getText().toString()));
            Collections.reverse(peoples);
        }
        printPeople();
    }

    public void onDelClick(View view) {
        if (peoples.size() != 0 && peoples.get(0) != null) {
            peoples.remove(0);
        }
        printPeople();
    }

    public void printPeople() {
        if (peoples.size() != 0 && peoples.get(0) != null) {
            fName.setText(peoples.getFirst().getName());
            fSname.setText(peoples.getFirst().getSname());
            fMale.setText(peoples.getFirst().getMale());
        } else {
            fName.setText("");
            fSname.setText("");
            fMale.setText("");
        }
    }

}
