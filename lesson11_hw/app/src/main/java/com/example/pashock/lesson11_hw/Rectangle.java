package com.example.pashock.lesson11_hw;

/**
 * Created by pashock on 24.02.16.
 */
public class Rectangle {

    private double side1;
    private double side2;

    public void setSide1(Double Side) {
        side1 = Side;
    }

    public void setSide2(Double Side) {
        side2 = Side;
    }

    private double AreaCalculator() {
        return side1 * side2;
    }

    private double PerimeterCalculator() {
        return 2 * (side1 + side2);
    }

    public double getArea() {
        return AreaCalculator();
    }

    public double getPerimeter() {
        return PerimeterCalculator();
    }

}
