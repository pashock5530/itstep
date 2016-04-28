package com.example.pashock.lesson140416;

import android.util.Log;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by pashock on 14.04.16.
 */
public class Contact {

    private String name;
    private String sname;
    private String phone;
    private LinkedList<String> phones;

    public Contact() {
        name = "";
        sname = "";
        phones = new LinkedList<>();
    }

    public void addContact(String name, String sname, String phone) {
        this.name = name;
        this.sname = sname;
        this.phone = phone;
        this.phones.add(phone);
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public String getPhone() {
        return phone;
    }

    public boolean checkContact(String ph) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).equals(ph)) {
                return true;
            }
        }
        return false;
    }

    public void addPhone(String phone) {
        phones.add(phone);
    }

    public void print() {
        Log.d("name", name);
        Log.d("sname", sname);
        for (int i = 0; i < phones.size(); i++) {
            Log.d("p" + i, String.valueOf(phones.get(i)));
        }
        Log.d("-----", "-----");
    }

    @Override
    public boolean equals(Object object) {

        try {
            if (object == null)
                return false;

            Contact p = (Contact) object;
            if (p.name == this.name) {
                if (p.sname == this.sname) {
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
            for (int i = 0; i < sname.length(); i++) {
                temp += Integer.valueOf(sname.toCharArray()[i]);
            }
            return temp;

        } catch (Exception e) {
            return -1;
        }
    }

}
