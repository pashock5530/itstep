package com.company.pashock5530;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson 3");
        /*Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик
        (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера.*/
        //task1();

        /*Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.*/
        //task2();
    }

    public static void task1() {
        int[] arr1 = new int[10];
        int start = 2;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = start;
            start += 2;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void task2() {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
