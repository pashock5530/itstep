package com.example.pashock.lesson140416;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by pashock on 14.04.16.
 */
public class Book {

    private LinkedList<Contact> list;

    public Book() {
        list = new LinkedList<>();
    }

    public LinkedList<Contact> getList() {
        return list;
    }

    public void addContact(Contact contact) {
        if (list.size() == 0) {
            list.add(contact);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equals(contact.getName()) && list.get(i).getSname().equals(contact.getSname())) {
                    if (!list.get(i).checkContact(contact.getPhone())) {
                        list.get(i).addPhone(contact.getPhone());
                    }
                } else {
                    list.add(contact);
                }
            }
        }
    }

    /*private boolean checkList(Contact contact) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(contact.getName())
                    && list.get(i).getSname().equals(contact.getSname())) {
                if (list.get(i).checkContact(contact.getPhone())) {
                    ret
                }
            }
        }
        return true;
    }*/

}
