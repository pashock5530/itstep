package com.example.pashock.lesson20;

/**
 * Created by pashock on 05.04.16.
 */
public class People {

    private char[] name;
    private char[] fname;
    private char[] telephone;

    public People(char[] name, char[] fname, char[] telephone) {
        this.name = name;
        this.fname = fname;
        this.telephone = telephone;
    }

    /*public String getInfo() {
        return name + " " + fname + " " + telephone;
    }*/

    public char[] getName() {
        return name;
    }

    public char[] getFname() {
        return fname;
    }

    public char[] getTelephone() {
        return telephone;
    }

}
