package com.example.pashock.lesson210416;

import java.util.HashMap;

/**
 * Created by pashock on 21.04.16.
 */
public class People {

    private String name;
    private int age;
    private HashMap<Integer, String> telephones;

    public People(String _name, int _age, String _tel) {
        name = _name;
        age = _age;
        addTel(_tel);
    }

    private void addTel(String _tel) {
        if (!telephones.containsValue(_tel)) {
            telephones.put(telephones.size()+1, _tel);
        }
    }

    public boolean checkTel(String _tel) {
        if (!telephones.containsValue(_tel)) {
            return false;
        }
        return true;
    }
}
