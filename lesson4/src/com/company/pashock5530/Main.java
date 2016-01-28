package com.company.pashock5530;

import java.lang.Math;
import java.util.Random;

/*
 *
 * Массивы: одномерные, многомерные
 * Циклы: while, for, for each
 * break, continue
 *
 */

public class Main {

    public static void main(String[] args) {
	    /* Одномерный массив */
        //task1();

        /* Двумерный массив */
        //task2();

        /* Одномерный строковый массив */
        //task3();

        /* Цикл while */
        //task4();

        /* Цикл for */
        //task5();

        /* Цикл for each */
        //task6();

        /* Цикл for для многомерных массивов */
        //task7();

        /* break */
        //task8();

        /* continue */
        //task9();

        /* Практика */
        //task10();
        task11();

    }

    public static void task1() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[2]);
    }

    public static void task2() {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
        };
        System.out.println(array[1][3]);
    }

    public static void task3() {
        String array[] = {"Hello", "world"};
        System.out.println(array[1]);
    }

    public static void task4() {
        int i[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int y = 0;
        while (y < i.length) {
            System.out.println(i[y]);
            y++;
        }
    }

    public static void task5() {
        int i[] = {1, 2, 3, 4, 5, 6};
        for (int y = 0; y < i.length; y++) {
            System.out.println(i[y]);
        }
        System.out.println("-----");
        for (int y = 0; y < i.length; y += 2) {
            System.out.println(i[y] + " " + i[y+1]);
        }
    }

    public static void task6() {
        int i[] = {1, 2, 3, 4, 5, 6};
        for (int y : i) {
            System.out.println(y);
        }
    }

    public static void task7() {
        int array[][] = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10); //(i + j);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task8() {
        int i[] = {1, 2, 3, 4, 5, 6};
        for (int y = 0; y < i.length; y++) {
            if (i[y] == 4) {
                break;
            }
            System.out.println(i[y]);
        }
    }

    public static void task9() {
        int array[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    public static void task10() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void task11() {
        int array[] = new int[100];
        int ch = 0;
        int notch = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
            if (array[i] % 2 == 0) {
                ch++;
            } else {
                notch++;
            }
            //System.out.print(array[i] + " ");
        }
        System.out.println("К-во четных: " + ch);
        System.out.println("К-во нечетных: " + notch);
        if (ch > notch) {
            System.out.println("Четных больше");
        } else {
            System.out.println("Нечетных больше");
        }
    }

}
