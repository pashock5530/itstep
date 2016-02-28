package com.example.pashock.lesson11;

/**
 * Created by pashock on 25.02.16.
 */
public class Contact {

    private String name;
    private int number;

    public Contact() {
        name = "";
        number = -1;
    }

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getContact() {
        return name+" "+String.valueOf(number);
    }

}
