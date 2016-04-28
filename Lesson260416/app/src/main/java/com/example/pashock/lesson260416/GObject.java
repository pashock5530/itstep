package com.example.pashock.lesson260416;

import android.graphics.Color;

/**
 * Created by pashock on 27.04.16.
 */
public class GObject {

    private int pointPlus;
    private int pointMinus;
    private int top;
    private int left;
    private int speed;
    private int colors[] = { Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED, Color.CYAN, Color.GRAY, Color.BLACK, Color.YELLOW };

    public GObject(int left) {
        pointPlus = (int) (Math.random()*5+1);
        pointMinus = (int) (Math.random() * pointPlus + 1) + pointPlus;
        top = 0;
        this.left = left;
        speed = (int) (Math.random()*10) + 4;
    }

    public int getColor() {
        return colors[(int) (Math.random()*colors.length)];
    }

    public int getPointPlus() {
        return pointPlus;
    }

    public int getPointMinus() {
        return pointMinus;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getSpeed() {
        return speed;
    }

}
