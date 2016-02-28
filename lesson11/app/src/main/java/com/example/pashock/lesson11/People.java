package com.example.pashock.lesson11;

/**
 * Created by pashock on 23.02.16.
 */
public class People {

    private String name;
    private int age;
    private Contact[] contacts;

    public People() {
        name = "";
        age = -1;
        contacts = new Contact[0];
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        this.contacts = new Contact[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void addContact(String name, int age) {
        this.contacts[0] = new Contact(name, age);
    }

}
