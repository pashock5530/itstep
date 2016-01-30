package com.company.pashock5530;

/*
 *
 * В символьный массив вводиться любое количество символов, как числовых, так и любых других.
 *
 * Необходимо произвести анализ введенных данных и вывести на экран следующую информацию о массиве:
 *
 * 1) Количество элементов в массиве, если 0 , то написать, что массив пуст.
 * 2) Найти все числовые символы, посчитать их среднее арифметическое и найти максимальное число.
 * 3) Создать дополнительный массив, в который записать все символы, которые не принадлежат
 * числовым символам и символам английского алфавита.
 *
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char array[] = new char[0];
        switch (menu()) {
            case '0':
                System.out.println("Программа завершилась.");
                break;
            case '1':
                array = random();
                break;
            case '2':
                array = keyboard();
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        arraysize(array);
        numbarray(array);
    }

    public static String scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static char menu() {
        System.out.println("Выберите, как заполнить массив:");
        System.out.println("    1. Random");
        System.out.println("    2. С клавиатуры");
        System.out.println("    0. Выход");
        System.out.print("Введите пункт: ");
        return scanner().charAt(0);
    }

    public static char[] random() {
        Random rand = new Random();
        System.out.print("Введите размер массива: ");
        int n = Integer.parseInt(scanner());
        char array[] = new char[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rand.nextInt(100);
        }
        return array;
    }

    public static char[] keyboard() {
        System.out.print("Введите размер массива: ");
        int n = Integer.parseInt(scanner());
        char array[] = new char[n];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner().charAt(0);
        }
        return array;
    }

    public static void arraysize(char array[]) {
        if (array.length != 0) {
            System.out.println("Длина массива: " + array.length);
        } else {
            System.out.println("Массив пуст");
        }
    }

    public static void numbarray(char array[]) {
        int max = 0;
        int num = 0;
        double middle = 0;
        int numchar = 0;
        boolean flag = false;
        System.out.print("Массив чисел: [");
        for (int i = 0; i < array.length; i++) {
            Character e = new Character(array[i]);
            if (Character.isDigit(e)) {
                flag = true;
                num++;
                middle += Character.getNumericValue(e);
                if (max < Character.getNumericValue(e)) {
                    max = Character.getNumericValue(e);
                }
                System.out.print(Character.getNumericValue(e) + " ");
            }
            if ((array[i] < '0' || array[i] > '9') && (array[i] < 'A' || array[i] > 'Z') && (array[i] < 'a' || array[i] > 'z')) {
                numchar++;
            }
        }
        System.out.println("]");
        System.out.println("К-во числовых символов: " + num);
        System.out.println("Среднее арифметическое: " + (flag ? middle / num : "не найдено"));
        System.out.println("Максимальное число: " + (flag ? max : "не найдено"));
        chararray(array, numchar);
    }

    public static void chararray(char[] array, int n) {
        char chararray[] = new char[n];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] < '0' || array[i] > '9') && (array[i] < 'A' || array[i] > 'Z') && (array[i] < 'a' || array[i] > 'z')) {
                chararray[j] = array[i];
                j++;
            }
        }
        System.out.println("Массив символов: " + Arrays.toString(chararray));
        System.out.println("К-во символов: " + n);
    }

}
