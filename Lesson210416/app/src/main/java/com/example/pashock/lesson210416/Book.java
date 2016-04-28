package com.example.pashock.lesson210416;

import java.util.HashMap;

/**
 * Created by pashock on 21.04.16.
 */
public class Book {

    private HashMap<Integer, People> book;

    public Book() {
        book = new HashMap<>();
    }

    public Book(People people) {

    }

    private void addPeople(People people) {
        if (book.containsValue(people)) {
            //book.put()
        }
    }

}
