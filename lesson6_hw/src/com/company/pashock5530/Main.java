package com.company.pashock5530;

import java.util.Scanner;

/*
 *
 * При запуске программы в консоли появляется предложение, о том  какую фигуру нарисовать, при подтверждении
 * в консоли должна отрисовываться одна из геометрических фигур:  линия, круг,  квадрат, треугольник и т.д.
 *
 */

public class Main {

    public static void main(String[] args) {
        switch (menu()) {
            case '0':
                System.out.println("Программа завершилась.");
                break;
            case '1':
                square();
                break;
            case '2':
                triangle();
                break;
            case '3':
                triangleRight();
                break;
            case '4':
                line();
                break;
            case '5':
                circle();
                break;
            default:
                System.out.println("Что-то пошло не так");
        }
    }

    public static String scanner() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static char menu() {
        System.out.println("Выберите фигуру:");
        System.out.println("    1. Квадрат/Прямоугольник");
        System.out.println("    2. Треугольник");
        System.out.println("    3. Прямоугольный треугольник");
        System.out.println("    4. Линия");
        System.out.println("    5. Круг");
        System.out.println("    0. Выход");
        System.out.print("Введите пункт: ");
        return scanner().charAt(0);
    }

    public static void square() {
        System.out.print("Введите длину: ");
        int a = Integer.parseInt(scanner());
        System.out.print("Введите ширину: ");
        int b = Integer.parseInt(scanner());
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == b-1) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == a - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void triangle() {
        System.out.print("Введите основание: ");
        int b = Integer.parseInt(scanner());
        int middle = (b / 2);
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < middle - i / 2; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (i == 0 || i == 1 || i == b-1) {
                    if (i % 2 == 0) {
                        System.out.print(" *");
                    } else {
                        System.out.print("* ");
                    }
                } else if (j == 0 || j == i) {
                    if (i % 2 == 0) {
                        System.out.print(" *");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleRight() {
        System.out.print("Введите основание: ");
        int b = Integer.parseInt(scanner());
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (i == 0 || i == 1 || i == b-1) {
                    System.out.print("* ");
                } else if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void line() {
        System.out.print("Введите длину: ");
        int a = Integer.parseInt(scanner());
        System.out.print("Вертикально (d/в) / Горизонтально (h/г): ");
        String b = scanner();
        for (int i = 0; i < a; i++) {
            if (b.equals("d") || b.equals("в")) {
                System.out.println("*");
            } else if (b.equals("h") || b.equals("г")) {
                System.out.print("* ");
            } else {
                System.out.println("Что-то пошло не так");
            }
        }
    }

    public static void circle() {
        System.out.print("Введите радиус: ");
        int r = Integer.parseInt(scanner());
        double d = 1.0 / r;
        int n;
        for (int i = r; i >= -r; --i) {
            /*double n2 = (Math.cos(Math.asin(d * Math.abs(i))) * r);
            double newDouble = new BigDecimal(n2).setScale(0, RoundingMode.UP).doubleValue();
            n = (int) newDouble;*/
            n = (int) (Math.cos(Math.asin(d * Math.abs(i))) * r);
            for (int j = 0; j < r - n; ++j) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 0; j < n * 2; ++j) {
                System.out.print("  ");
            }
            System.out.println(" *");
        }
    }

}
