package com.example.pashock.lesson260416;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    private int count = 0;

    private GObjects objects;

    FrameLayout startPoligon;
    FrameLayout obPoligon;

    private Timer mTimer;
    private MyTimerTask mMyTimerTask;
    private int timerSpeed = 35;

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    TextView countText;

    Button pauseBtn;

    private HashMap<Integer, Button> btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_main);

        objects = new GObjects();

        startPoligon = (FrameLayout) findViewById(R.id.startPoligon);
        obPoligon = (FrameLayout) findViewById(R.id.poligonBlock);

        countText = (TextView) findViewById(R.id.bal);
        countText.setText(String.valueOf(count));

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);

        pauseBtn = (Button) findViewById(R.id.pauseBtn);

        btnMap = new HashMap<>();
        setBtnMap();
        setBtn();

        pauseBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mTimer != null) {
                    mTimer.cancel();
                    mTimer = null;
                    startPoligon.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void setBtnMap() {
        //btn1.setBackgroundColor(objects.getObject(0).getColor());
        btnMap.put(0, btn1);
        //btn2.setBackgroundColor(objects.getObject(1).getColor());
        btnMap.put(1, btn2);
        //btn3.setBackgroundColor(objects.getObject(2).getColor());
        btnMap.put(2, btn3);
        //btn4.setBackgroundColor(objects.getObject(3).getColor());
        btnMap.put(3, btn4);
        //btn5.setBackgroundColor(objects.getObject(4).getColor());
        btnMap.put(4, btn5);
        //btn6.setBackgroundColor(objects.getObject(5).getColor());
        btnMap.put(5, btn6);
        //btn7.setBackgroundColor(objects.getObject(6).getColor());
        btnMap.put(6, btn7);
        //btn8.setBackgroundColor(objects.getObject(7).getColor());
        btnMap.put(7, btn8);
        //btn9.setBackgroundColor(objects.getObject(8).getColor());
        btnMap.put(8, btn9);
        //btn10.setBackgroundColor(objects.getObject(9).getColor());
        btnMap.put(9, btn10);
    }

    public void setBtn() {
        for (int i = 0; i < btnMap.size(); i++) {
            btnMap.get(i).setBackgroundColor(objects.getObject(i).getColor());
        }
    }

    public void onClick(View view) {
        if (view == null || !(view instanceof TextView)) {
            return;
        }

        int num = Integer.valueOf(((TextView)view).getText().toString());
        count += objects.getObject(num).getPointPlus();
        countText.setTextColor(705021550);
        countText.setText(String.valueOf(count));
        objects.setObject(num);
        view.setBackgroundColor(objects.getObject(num).getColor());
    }

    public void onStartClick(View view) {
        startPoligon.setVisibility(View.GONE);

        if (mTimer != null) {
            mTimer.cancel();
        }

        mTimer = new Timer();
        mMyTimerTask = new MyTimerTask();

        mTimer.schedule(mMyTimerTask, 50, timerSpeed);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder ab = new AlertDialog.Builder(MainActivity.this);
        ab.setTitle("Выход")
                .setMessage("Выйти из игры?")
                .setCancelable(false)
                .setPositiveButton("Да",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                moveTaskToBack(true);
                                System.runFinalization();
                                System.exit(0);
                            }
                        })
                .setNegativeButton("Нет",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = ab.create();
        alert.show();
    }

    class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            runOnUiThread(new Runnable() {

                @Override
                public void run() {

                    if (count > 50 && timerSpeed > 30) {
                        if (mTimer != null) {
                            mTimer.cancel();
                            mTimer = null;
                        }
                        timerSpeed = 30;
                        if (mTimer == null) {
                            mTimer = new Timer();
                            mMyTimerTask = new MyTimerTask();

                            mTimer.schedule(mMyTimerTask, 50, timerSpeed);
                        }
                    } else {
                        if (count > 100 && timerSpeed > 25) {
                            if (mTimer != null) {
                                mTimer.cancel();
                                mTimer = null;
                            }
                            timerSpeed = 25;
                        }
                        if (mTimer == null) {
                            mTimer = new Timer();
                            mMyTimerTask = new MyTimerTask();

                            mTimer.schedule(mMyTimerTask, 50, timerSpeed);
                        }
                    }
                    FrameLayout.LayoutParams params;
                    for (int i = 0; i < btnMap.size(); i++) {
                        params = (FrameLayout.LayoutParams) btnMap.get(i).getLayoutParams();
                        if (params.topMargin + btnMap.get(i).getMeasuredHeight() >= obPoligon.getHeight()) {
                            count -= objects.getObject(i).getPointMinus();
                            countText.setTextColor(702155050);
                            countText.setText(String.valueOf(count));
                            objects.setObject(i);
                            params.setMargins(objects.getObject(i).getLeft(), objects.getObject(i).getTop(), 0, 0);
                            btnMap.get(i).setLayoutParams(params);
                        } else {
                            params.setMargins(objects.getObject(i).getLeft(), objects.getObject(i).getTop(), 0, 0);
                            btnMap.get(i).setLayoutParams(params);
                            objects.getObject(i).setTop(objects.getObject(i).getTop() + objects.getObject(i).getSpeed());
                        }
                    }
                }
            });
        }
    }

}
