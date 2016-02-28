package com.example.pashock.lesson_12;

/**
 * Created by pashock on 25.02.16.
 */
public class Document {

    private Head head;
    private Body body;
    private Footer footer;

    public Document() {
        this.head = new Head();
        this.body = new Body();
        this.footer = new Footer();
    }

    public String show() {
        return head.getName()+" "+body.getName()+" "+footer.getName();
    }

}
