package com.company.pashock5530;

/*
 *
 * Разработать программу для вычисления сложности введённого пароля.
 * Если пароль состоит из 8 символов и более, при этом первая буква заглавная,
 * а последняя является числовым символом, тогда это сложный пароль. Если больше 8 символов,
 * но условия не выполнены, тогда этот пароль обычный, а так же обычным считается любой символьный пароль
 * от 4 символов. Если длина пароля меньше 4 символов, тогда он считается простым.
 *
 */

import java.util.Random;

public class Main {

    public static void main(String argv[]) {
        String pass = generatePass();
        System.out.println("Пароль: " + pass);
        System.out.print("Безопасность: ");
        if (pass.length() >= 8) {
            if ((pass.charAt(0) >= 'A' && pass.charAt(0) <= 'Z') && (pass.charAt(pass.length()-1) >= '0' && pass.charAt(pass.length()-1) <= '9')) {
                System.out.println("сложный");
            } else {
                System.out.println("обычный");
            }
        } else if (pass.length() >= 4 && pass.length() < 8) {
            System.out.println("обычный");
        } else {
            System.out.println("простой");
        }
    }

    public static String generatePass() {
        Random rand = new Random();
        int n = rand.nextInt(12)+1;
        //char[] pass = new char[n];
        String pass = "";
        int temp;
        int i = 0;
        while (i < n) {
            temp = rand.nextInt(100);
            if ((temp >= '0' && temp <= '9') || (temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) {
                pass += (char) temp;
                i++;
            }
        }
        return pass.toString();
    }
}
