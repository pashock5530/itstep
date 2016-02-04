package com.company.pashock5530;

/*
 *
 * Строки
 *
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /* работа со строками */
	    task1();
        /* практика */
        //task2();
    }

    public static void task1() {
        String str1 = "String1";
        String str2 = "string1";
        String str3 = new String(str1);
        if (str1 == str3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (str1.equals(str3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(str1.indexOf('i', 2));
        System.out.println(str1.charAt(2));
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(1, 5));
        System.out.println(str1.concat(str2));
        System.out.println(str1.toLowerCase());
        char ch[] = str1.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.replace("g1", "123123"));
    }

    public static void task2() {
        String fname;
        String iname;
        String oname;
        int age;
        String email;
        String info = "Милькевич Павел Николаевич 21 pashock5530@gmail.com";
        int from = 0;
        int to = 0;
        to = info.indexOf(' ', from);
        fname = info.substring(from, to);
        System.out.println("Фамилия: "+fname);
        from = to+1;
        to = info.indexOf(' ', from);
        iname = info.substring(from, to);
        System.out.println("Имя: "+iname);
        from = to+1;
        to = info.indexOf(' ', from);
        oname = info.substring(from, to);
        System.out.println("Отчество: "+oname);
        from = to+1;
        to = info.indexOf(' ', from);
        age = Integer.valueOf(info.substring(from, to));
        System.out.println("Возраст: "+age);
        from = to+1;
        int a = info.indexOf('@', from);
        if (a == -1) {
            email = "не найден";
        } else {
            to = info.length();
            email = info.substring(from, to);
        }
        System.out.println("E-mail: "+email);
    }
}
