package com.example.pashock.lesson140416;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends Activity {

    private EditText name;
    private EditText sname;
    private EditText phone;

    private Book book;
    private Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.editText);
        sname = (EditText) findViewById(R.id.editText2);
        phone = (EditText) findViewById(R.id.editText3);

        book = new Book();
    }

    public void addClick(View view) {
        contact = new Contact();
        contact.addContact(name.getText().toString(), sname.getText().toString(), phone.getText().toString());
        try {
            book.addContact(contact);
        } catch (Exception e) {
            showToast(e.getMessage());
        }
        for (int i = 0; i < book.getList().size(); i++) {
            book.getList().get(i).print();
        }

    }

    public void showToast(String mes) {
        Toast toast = Toast.makeText(getApplicationContext(),
                mes,
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

}
