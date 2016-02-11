package com.example.pashock.lesson7_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tV;
    Button butt;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV = (TextView) findViewById(R.id.textView);
        et = (EditText) findViewById(R.id.editText);

    }

    public void changeOnClick(View view) {
        butt = (Button) findViewById(R.id.button);
        tV.setText("");
        String text = et.getText().toString();
        for (int i = 0; i < text.length(); i++) {
            tV.append(text.charAt(i) + ",");
        }
//
//        View.OnClickListener oclButt = new View.OnClickListener() {
//            @Override
//            public void onClick(View dialog) {
//                tV.setText("Hello!");
//            }
//        };
//
//        butt.setOnClickListener(oclButt);
    }
}
