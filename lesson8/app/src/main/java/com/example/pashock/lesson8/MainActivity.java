package com.example.pashock.lesson8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myEditText;
    boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myEditText = (EditText) findViewById(R.id.myEditText1);
    }

    public void onButtonClick(View view) {
        if (flag) {
            myEditText.setText("");
        }
        switch (view.getId()) {
            case R.id.myButton0:
                myEditText.append("0");
                flag = false;
                break;
            case R.id.myButton1:
                myEditText.append("1");
                flag = false;
                break;
            case R.id.myButton2:
                myEditText.append("2");
                flag = false;
                break;
            case R.id.myButton3:
                myEditText.append("3");
                flag = false;
                break;
            case R.id.myButton4:
                myEditText.append("4");
                flag = false;
                break;
            case R.id.myButton5:
                myEditText.append("5");
                flag = false;
                break;
            case R.id.myButton6:
                myEditText.append("6");
                flag = false;
                break;
            case R.id.myButton7:
                myEditText.append("7");
                flag = false;
                break;
            case R.id.myButton8:
                myEditText.append("8");
                flag = false;
                break;
            case R.id.myButton9:
                myEditText.append("9");
                flag = false;
                break;
            case R.id.myButtonDot:
                myEditText.append(".");
                flag = false;
                break;
            case R.id.myButtonPlus:
                myEditText.append(" + ");
                flag = false;
                break;
            case R.id.myButtonMinus:
                myEditText.append(" - ");
                flag = false;
                break;
            case R.id.myButtonMulty:
                myEditText.append(" * ");
                flag = false;
                break;
            case R.id.myButtonDivide:
                myEditText.append(" / ");
                flag = false;
                break;
            case R.id.myButtonEqually:
                equally(view);
                flag = true;
                break;
        }
    }

    public void equally(View view) {
        String text = myEditText.getText().toString();
        int pos = text.indexOf(" ");
        double number1 = Double.parseDouble(text.substring(0, pos));
        double number2 = Double.parseDouble(text.substring(pos+2, text.length()));
        String znak = text.substring(pos + 1, pos + 2);
        String sum = "";
        switch (znak) {
            case "/":
                if (number2 == 0) {
                    sum = "Error";
                } else {
                    sum = Double.toString(number1 / number2);
                }
                break;
            case "*":
                sum = Double.toString(number1 * number2);
                break;
            case "-":
                sum = Double.toString(number1 - number2);
                break;
            case "+":
                sum = Double.toString(number1 + number2);
                break;
        }
        Log.d("Операция "+znak, "результат: "+sum);
        myEditText.setText(sum);
    }
}
