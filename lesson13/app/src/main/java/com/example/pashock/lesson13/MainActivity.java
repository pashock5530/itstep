package com.example.pashock.lesson13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Converter converter;

    EditText rate;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        converter = new Converter();

        rate = (EditText) findViewById(R.id.editText);

        text = (TextView) findViewById(R.id.textView);
    }

    public void onClickConverter(View view) {
        converter.addRate(Double.parseDouble(rate.getText().toString()));
        text.setText(Arrays.toString(converter.getRate()));
    }
}
