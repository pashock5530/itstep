package com.example.pashock.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text;
    boolean flagDot = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.text);
    }

    public void keyClick(View view) {
        if (view == null || !(view instanceof TextView)) {
            return;
        }
        String str = ((TextView)view).getText().toString();
        switch (str) {
            case ".":
                if (flagDot) {
                    setText(str);
                    flagDot = false;
                }
                break;
            case "0":
                setText(str);
                break;
            case "1":
                setText(str);
                break;
            case "2":
                setText(str);
                break;
            case "3":
                setText(str);
                break;
            case "4":
                setText(str);
                break;
            case "5":
                setText(str);
                break;
            case "6":
                setText(str);
                break;
            case "7":
                setText(str);
                break;
            case "8":
                setText(str);
                break;
            case "9":
                setText(str);
                break;
        }
    }

    private void setText(String str) {
        text.append(str);
    }
}
