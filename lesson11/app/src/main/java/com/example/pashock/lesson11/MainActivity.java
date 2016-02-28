package com.example.pashock.lesson11;

/**
 * Классы
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText userAge;
    TextView text;

    RelativeLayout users;
    RelativeLayout telephones;

    int col = 5;
    int i = 0;

    People peoples[] = new People[col];
    People user = null;
    int userID = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int j = 0; j < peoples.length; j++) {
            peoples[j] = new People();
        }

        userName = (EditText) findViewById(R.id.userName);
        userAge = (EditText) findViewById(R.id.userAge);
        text = (TextView) findViewById(R.id.textView);

        users = (RelativeLayout) findViewById(R.id.users);
        telephones = (RelativeLayout) findViewById(R.id.telephones);
        telephones.setVisibility(View.GONE);
    }

    public void onClickInput(View view) {
        if (!userName.getText().toString().equals("") && !userAge.getText().toString().equals("")) {
            peoples[i++] = new People(userName.getText().toString(), Integer.parseInt(userAge.getText().toString()));
            if (i + 1 > col) {
                addPeoples();
            }
            userName.setText("");
            userAge.setText("");
            showUsers();
        }
    }

    public void addPeoples() {
        col += col;
        People temp[] = new People[col];
        int t = peoples.length;
        for (int j = 0; j < t; j++) {
            temp[j] = peoples[j];
        }
        peoples = new People[col];
        for (int j = 0; j < t; j++) {
            peoples[j] = temp[j];
        }
        for (int j = t; j < peoples.length; j++) {
            peoples[j] = new People();
        }
    }

    public void showUsers() {
        text.setText("");
        for (int j = 0; j < peoples.length; j++) {
            if (!peoples[j].getName().equals("") && peoples[j].getAge() != -1) {
                text.append(peoples[j].getName() +" "+peoples[j].getAge()+"\n");
            }
        }
    }

    public People searchUser() {
        for (int j = 0; j < peoples.length; j++) {
            if (!userName.getText().toString().equals("") && !userAge.getText().toString().equals("")) {
                if (userName.getText().toString().equals(peoples[j].getName()) && Integer.parseInt(userAge.getText().toString()) == peoples[j].getAge()) {
                    return peoples[j];
                }
            }
        }
        return null;
    }

    public int searchUserID() {
        for (int j = 0; j < peoples.length; j++) {
            if (!userName.getText().toString().equals("") && !userAge.getText().toString().equals("")) {
                if (userName.getText().toString().equals(peoples[j].getName()) && Integer.parseInt(userAge.getText().toString()) == peoples[j].getAge()) {
                    return j;
                }
            }
        }
        return -1;
    }

    public void onClickViewUsers(View view) {
        users.setVisibility(View.VISIBLE);
        telephones.setVisibility(View.GONE);
        user = null;
    }

    public void onClickEdit(View view) {
        if (!userName.getText().toString().equals("") && !userAge.getText().toString().equals("")) {
            if (userID == -1) {
                userID = searchUserID();
                if (userID >= 0) {
                    text.setText("Введите новые данные и нажмите \"Редактировать\"");
                }
            } else {
                peoples[userID].setName(userName.getText().toString());
                peoples[userID].setAge(Integer.parseInt(userAge.getText().toString()));
                showUsers();
            }
            userName.setText("");
            userAge.setText("");
        }
    }

    public void onClickDelete(View view) {
        if (!userName.getText().toString().equals("") && !userAge.getText().toString().equals("")) {
            userID = searchUserID();
            if (userID >= 0) {
                for (int j = userID; j < peoples.length-1; j++) {
                    peoples[j] = peoples[j+1];
                }
            }
            userName.setText("");
            userAge.setText("");
            showUsers();
        }
    }

    public void onClickViewTel(View view) {
        if (!userName.getText().toString().equals("") && !userAge.getText().toString().equals("")) {
            users.setVisibility(View.GONE);
            telephones.setVisibility(View.VISIBLE);
            user = searchUser();
            showTelephones();
        }
    }

    public void showTelephones() {
        text = (TextView) findViewById(R.id.textView2);
        text.setText("");
        if (user == null) {
            text.setText("Человек не найден");
        } else {
            Contact[] con = user.getContacts();
            if (con.length == 0) {
                text.setText("Контакты не найдены");
            } else {
                for (int j = 0; j < con.length; j++) {
                    if (!con[j].getName().equals("") && con[j].getNumber() != -1) {
                        text.append(peoples[j].getName() + " " + con[j].getNumber() + "\n");
                    }
                }
            }
        }
    }

}
