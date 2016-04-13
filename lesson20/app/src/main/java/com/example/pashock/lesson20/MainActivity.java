package com.example.pashock.lesson20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<People> peoples;

    EditText name;
    EditText fname;
    EditText telephone;
    TextView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peoples = new ArrayList<>();
        name = (EditText) findViewById(R.id.name);
        fname = (EditText) findViewById(R.id.fname);
        telephone = (EditText) findViewById(R.id.telephone);
        list = (TextView) findViewById(R.id.textView);
    }

    public void addClick(View view) {
        People p = new People(name.getText().toString().toCharArray(), fname.getText().toString().toCharArray(), telephone.getText().toString().toCharArray());
        peoples.add(p);
        printPeoples();
    }

    public void delClick(View view) {

        People p = new People(name.getText().toString().toCharArray(), fname.getText().toString().toCharArray(), telephone.getText().toString().toCharArray());
        peoples.remove(1);
        /*
        Iterator<People> iterator = peoples.iterator();

        while (iterator.hasNext()) {
            People pt = iterator.next();
            if (pt.getName().equals(p.getName()) && pt.getFname().equals(p.getFname())) {
                iterator.remove();
            }
        }*/

        printPeoples();
    }

    public void printPeoples() {
        list.setText(peoples.toString());
    }
}
