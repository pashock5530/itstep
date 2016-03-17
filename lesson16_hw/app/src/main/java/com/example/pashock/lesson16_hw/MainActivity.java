package com.example.pashock.lesson16_hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AbstractHandler handler;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);
    }

    public void onXml(View view) {
        handler = new XMLHandler();
        text.setText(handler.getType());
    }
    public void onTxt(View view) {
        handler = new TXTHandler();
        text.setText(handler.getType());
    }
    public void onDoc(View view) {
        handler = new DOCHandler();
        text.setText(handler.getType());
    }
}
