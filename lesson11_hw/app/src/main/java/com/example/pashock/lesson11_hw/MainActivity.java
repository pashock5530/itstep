package com.example.pashock.lesson11_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        EditText side1 = (EditText) findViewById(R.id.editText);
        EditText side2 = (EditText) findViewById(R.id.editText2);

        Rectangle rectangle = new Rectangle();
        rectangle.setSide1(Double.parseDouble(side1.getText().toString()));
        rectangle.setSide2(Double.parseDouble(side2.getText().toString()));

        TextView text1 = (TextView) findViewById(R.id.textView3);
        text1.setText("Периметр: "+String.valueOf(rectangle.getPerimeter()));
        TextView text2 = (TextView) findViewById(R.id.textView4);
        text2.setText("Площадь: "+String.valueOf(rectangle.getArea()));
    }
}
