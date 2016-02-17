package com.example.pashock.lesson9;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        factorial(4);
    }

    //факториал
    public int factorial(int i) {
        int a;
        if (i == 1) {
            a = 1;
        } else {
            a = i * factorial(--i);
        }
        Log.d("factorial", String.valueOf(a));
        return a;
    }

    double kredSum = 0;
    int period = 0;

    public void onSumClick(View view) {
        EditText fieldSum = (EditText) findViewById(R.id.fieldSum);
        kredSum = Double.valueOf(fieldSum.getText().toString());
        EditText fieldPeriod = (EditText) findViewById(R.id.fieldPeriod);
        period = Integer.valueOf(fieldPeriod.getText().toString());
        TextView textMSum = (TextView) findViewById(R.id.textMSum);
        textMSum.append(" "+String.valueOf(kredSum/period)+" грн");
    }

    double periodSum = 0;
    int sch = 1;

    public void onPSumClick(View view) {
        EditText fieldPSum = (EditText) findViewById(R.id.fieldPSum);
        periodSum += Double.valueOf(fieldPSum.getText().toString());
        TextView textPSum = (TextView) findViewById(R.id.textPeriodSum);
        sch++;
        textPSum.setText("Платеж "+String.valueOf(sch));
        fieldPSum.setText("");
        TextView textStatus = (TextView) findViewById(R.id.textStatus);
        if (kredSum - periodSum > 0 && kredSum - periodSum < kredSum) {
            textStatus.setText("Состояние: задолженость " + String.valueOf(kredSum - periodSum) + " грн");
        } else if (kredSum - periodSum < 0) {
            textStatus.setText("Состояние: переплата " + String.valueOf(-1 * (kredSum - periodSum)) + " грн");
        } else {
            textStatus.setText("Состояние: долг отсутствует");
        }
    }
}
