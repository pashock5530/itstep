package com.example.pashock.lesson190416;

import java.util.Objects;

/**
 * Created by pashock on 19.04.16.
 */
public class People {

    String name;
    int age;

    public People(String _name, int _age) {
        name = _name;
        age = _age;
    }

    public People() {
        name = "Pavel";
        age = 22;
    }

    @Override
    public boolean equals(Object object) {

        try {
            if (object == null)
                return false;

            People p = (People) object;
            if (p.name == this.name) {
                if (p.age == this.age) {
                    return true;
                }
                return false;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        try {
            int temp = 0;

            for (int i = 0; i < name.length(); i++) {
                temp += Integer.valueOf(name.toCharArray()[i]);
            }
            temp += age;
            return temp;

        } catch (Exception e) {
            return -1;
        }
    }

}
