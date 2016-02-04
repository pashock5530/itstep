package com.company.pashock5530;

/*
 *
 * Сортировки
 * Поиск
 *
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int array[] = {1, 20, 4, 16, 7, 4, 8};
	    // Сортировка пузырьком
        //task1(array);
        // Сортировка выбором (выборкой)
        //task2(array);
        // сравнение времени сортировки
        //task3();
        // Бинарный поиск
        //task4();
        // Ввод (Scaner)
        task5();
    }

    public static void task1(int[] array) {
        //System.out.println(Arrays.toString(array));
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    /*array[j] += array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] -=array[j+1];*/
                    array[j] = array[j] + array[j+1] - (array[j+1] = array[j]); //краткий вариант
                }
            }
        }
        //System.out.println(Arrays.toString(array));
    }

    public static void task2(int[] array) {
        //System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            array[i] = array[i] + array[min] - (array[min] = array[i]);
        }
        //System.out.println(Arrays.toString(array));
    }

    public static void task3() {
        Random rand = new Random();
        int array[] = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        long beginTime =  System.currentTimeMillis();
        task1(array);
        long endTime =  System.currentTimeMillis();
        System.out.println("Время пузырьком: "+(endTime-beginTime));
        beginTime =  System.currentTimeMillis();
        task2(array);
        endTime =  System.currentTimeMillis();
        System.out.println("Время выборкой: "+(endTime-beginTime));
    }

    public static void task4() {
        Random rand = new Random();
        int array[] = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 3));
    }

    public static void task5() {
        Scanner scaner = new Scanner(System.in);
        String cars[] = new String[5];

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Введите: ");
            cars[i] = scaner.nextLine();
        }
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));
    }

}
