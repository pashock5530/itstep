package com.company.pashock;

/*
 * Рекурсия
 */

public class Main {

    public static void main(String[] args) {
        // простая рекурсия
	    //task1(0);

        // вывод нечетных
        //task2(0);

        //вывод %3
        //task3(-10);

        //факториал
        //task4(3);

        //степень
        //pow(2, 3);

        //поиск
        //int a[] = {3, 3, 6, 3, 6, 3, 3, 6, 10};
        //search(a, 3, 0);

        //максимальное число
        //max(a, 0, 0);

    }

    public static void task1(int i) {
        System.out.println(" - " + i);
        if (i <= 2) {
            task1(++i);
        } else {
            return;
        }
        System.out.println(" - " + i);
    }

    public static void task2(int i) {
        if (i <= 10) {
            if (i % 2 != 0) {
                System.out.println(" " + i);
            }
            task2(++i);
        } else {
            return;
        }
    }

    public static void task3(int i) {
        if (i <= 10) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(" " + i);
            }
            task3(++i);
        } else {
            return;
        }
    }

    public static int task4(int i) {
        int a;
        if (i == 1) {
            a = 1;
        } else {
            a = i * task4(--i);
        }
        System.out.println(" " + a);
        return a;
    }

    public static double pow(double x, int n) {
        double a;
        if (n == 1) {
            a = x;
        } else {
            a = x * pow(x, --n);
        }
        System.out.println(" x " + a);
        return a;
    }

    public static void search(int[] a, int x, int i) {
        if (i < a.length) {
            if (a[i] == x) {
                System.out.println(" " + i);
            }
            search(a, x, ++i);
        } else {
            return;
        }
    }

    public static void max(int[] a, int x, int i) {
        if (i < a.length) {
            if (x < a[i]) {
                x = a[i];
            }
            max(a, x, ++i);
        } else {
            System.out.println(" " + x);
            return;
        }
    }

}
