package com.example.pashock.kwork1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends Activity {

    private Toast toast;

    private LevelMap levels;
    private Level level;

    private int count = 10;
    private int number = 1;
    private int help = 0;

    private TextView levelText;
    private TextView numberText;
    private EditText input;
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        levelText = (TextView) findViewById(R.id.levelText);
        numberText = (TextView) findViewById(R.id.numberText);
        input = (EditText) findViewById(R.id.input);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);

        levels = new LevelMap();

        setLevel();
        getProgress();

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

    protected void showToast(String message) {
        toast = Toast.makeText(
                getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }

    private void getProgress() {
        if (level != null) {
            levelText.setText(level.getNumber() + " из " + levels.getCount());
            numberText.setText(String.valueOf(count));
        }
    }

    private void setLevel() {
        help = 0;
        img1.setImageDrawable(null);
        img2.setImageDrawable(null);
        img3.setImageDrawable(null);
        img4.setImageDrawable(null);
        input.setText("");

        level = levels.getLevel(number);

        if (level != null) {

            InputStream inputStream;
            try {
                inputStream = getAssets().open(level.getImage(1));
                img1.setImageDrawable(Drawable.createFromStream(inputStream, null));
                inputStream = getAssets().open(level.getImage(2));
                img2.setImageDrawable(Drawable.createFromStream(inputStream, null));
                inputStream = getAssets().open(level.getImage(3));
                img3.setImageDrawable(Drawable.createFromStream(inputStream, null));
                inputStream = getAssets().open(level.getImage(4));
                img4.setImageDrawable(Drawable.createFromStream(inputStream, null));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            showToast("Пройдено!");
        }
    }

    public void checkWord(View view) {
        if (level != null && level.checkWord(input.getText().toString())) {
            if (number <= levels.getCount()) {
                count += level.getCount();
                number += 1;

                setLevel();
                getProgress();
                //Log.d("level", String.valueOf(number));
            }
        } else {
            showToast("Не угадали :(");
        }
    }

    public void helpClick(View view) {
        if (level != null) {
            String w = level.getWord();
            if (help < w.length() && count > 0) {
                help += 1;
                count -= level.getHelp();
                getProgress();
                input.setText(w.substring(0, help));
            } else {
                if (help >= w.length()) {
                    showToast("Отображено все слово");
                }
                if (count <= 0) {
                    showToast("У Вас нет подсказок");
                }
            }
        }
    }

}
