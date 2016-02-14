package com.company.pashock;

public class Main {

    public static void main(String[] args) {

        //3.27
        task1();

        //3.28
        //task2();

        //4.20
        //task3();

        //4.21
        //task4();

        //4.22
        //task5();

        //4.23
        //task6();

        //4.24
        //task7();

        //4.25
        //task8();
    }

    public static void task1() {
        int x = 0;
        int y = 0;

        if (x > 2 && y >3) {
            System.out.println("true");
        }
        if (x > 1 || y > -2) {
            System.out.println("true");
        }
        if (x >= 0 && y < 5) {
            System.out.println("true");
        }
        if (x > 3 || x < -1) {
            System.out.println("true");
        }
        if (x > 3 && x < 10) {
            System.out.println("true");
        }
        if (!(x > 2)) {
            System.out.println("true");
        }
        if (!(x > 0 && x < 5)) {
            System.out.println("true");
        }
        if (x > 10 && x <= 20) {
            System.out.println("true");
        }
        if ((y > 0 && y <= 4) && x < 5) {
            System.out.println("true");
        }
    }

    public static void task2() {
        int a = 0;
        int b = 0;
        int c = 0;

        if (a > 100 && b > 100) {
            System.out.println("true");
        }
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("true");
        }
        if (a > 0 || b > 0) {
            System.out.println("true");
        }
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println("true");
        }
        if ((a < 50) && !(b < 50) && !(c < 50)) {
            System.out.println("true");
        } else if (!(a < 50) && (b < 50) && !(c < 50)) {
            System.out.println("true");
        } else {
            System.out.println("true");
        }
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("true");
        }
    }

    public static void task3() {
        int m = 20;
        int n = 10;

        if (m % n == 0) {
            System.out.println(m / n);
        } else {
            System.out.println("m на n нацело не делится");
        }
    }

    public static void task4() {
        int a = 20;
        int b = 10;

        if (b % a == 0) {
            System.out.println("Число a является делителем числа b");
        } else {
            System.out.println("Число a не является делителем числа b");
        }
    }

    public static void task5() {
        int a = 14;

        if (a % 2 == 0) {
            System.out.println("a четное");
        }
        if (a % 10 == 7) {
            System.out.println("a оканчивается на 7");
        }
    }

    public static void task6() {
        int a = 12;

        if (a / 10 > a % 10) {
            System.out.println("первая цифра больше");
        } else if (a / 10 < a % 10) {
            System.out.println("вторая цифра больше");
        } else {
            System.out.println("цифры одинаковы");
        }
    }

    public static void task7() {
        int a = 52;
        int b = (int) Math.pow(a, 2);
        int c = (int) (4 * (Math.pow(a/10, 3) + Math.pow(a%10, 3)));

        if (b == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void task8() {
        int a = 28;
        int sum = a / 10 + a % 10;

        if (sum > 9) {
            System.out.println("сумма цифр является двузначным числом");
        } else {
            System.out.println("сумма цифр не является двузначным числом");
        }
        if (sum > a) {
            System.out.println("сумма цифр больше числа");
        } else {
            System.out.println("сумма цифр меньше числа");
        }
    }
}
