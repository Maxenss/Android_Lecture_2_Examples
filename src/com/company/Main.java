package com.company;

import java.util.Scanner;

public class Main {

    // Горячие клавиши
    // sout - для быстрого написания System.out.println
    // Ctrl + D - копирование и вставка текущей строки
    // ЛКМ + Alt + Мышь (Вверх или вниз) - печать на нескольких строках
    // Ctrl + Alt + L - форматирование кода
    // Ctrl + ЛКМ на объекте, переменной, методе, классе и т.д. - переход к определению

    public static void main(String[] args) {
        System.out.println("10 + 20 = " + (10 + 20));

        // Вывод на экран Hello world, с переносом строки
        System.out.println("Hello world!");
        // Вывод на экран Android the best!!! :))), с переносом строки
        System.out.println("Android the best!!! :)))");

        // Вывод на экран Boy, без переносоа строки
        System.out.print("Boy");
        // Вывод на экран Hello, без переносоа строки
        System.out.print("Hello");

        // Перенос строки
        System.out.println();

        // Типы данных
        int a = 10;
        int b = 20;
        int c = a + b;

        // System.out.print(a);
        // System.out.print(" + ");
        // System.out.print(b);
        // System.out.print(" = ");
        // System.out.print(c);

        System.out.println(a + " + " + b + " = " + c);

        // Ввод с клавиатуры
        Scanner scanner = new Scanner(System.in); // Скопировать

        int a1;   // =0
        int b1;   // =0
        int c1;   // =0

        System.out.print("Введите a1 : ");
        // Вводим значения с клавиатуры
        a1 = scanner.nextInt();
        System.out.print("Введите b1 : ");
        b1 = scanner.nextInt();

        c1 = a1 + b1;

        System.out.println(a1 + " + " + b1 + " = " + c1);

        // Теорима Пифагора
        // c^2 = a^2 + b^2;
        // с = ?
        // c = корень(a^2 + b^2)

        double a2;
        double b2;
        double c2;

        System.out.print("Введите a2 : ");
        // Вводим значения с клавиатуры
        a2 = scanner.nextDouble();
        System.out.print("Введите b2 : ");
        b2 = scanner.nextDouble();

        // Math - содержит стандартные мате. функции
        // Math.pow - возведение  в степень. Первый аргумент - число, а второй аргумент - степень
        // Math.sqrt - квадртный корень

        c2 = Math.sqrt((a2 * a2) + Math.pow(b2, 2));

        System.out.println("корень(a2^2 + b2^2) = " + c2);

        // 231.3142 - в студии указываете вещественные типы через точку
        // 231,3142 - в консоле указываете вещественные типы через запятую

        // Приведение типов
        // Безопасное(невное приведение типов)
        int integerValue = 20;
        double doubleValue = integerValue;      // 20.0

        // 8 bits
        byte byteValue = 100;
        // 64 bits
        long longValue = byteValue; // 100


        // Опасное (явное приведение типов)
        double doubleValue1 = 30.3;
        // (int)doubleValue1 - приведение к типу int
        int integerValue1 = (int) doubleValue1;  //  30

        // 64 bits
        long longValue1 = 1000;
        // 8 bits
        byte byteValue1 = (byte) longValue1; // 232

        // Решение квадратного уравнения
        // ax^2 + bx + c = 0;
        // D = b^2 + 4*a*c
        // x1 = (-b + sqrt(D))/2a
        // x2 = (-b - sqrt(D))/2a

        double a3 = 0;
        double b3 = 0;
        double c3 = 0;
        double D = 0;
        double x1 = 0;
        double x2 = 0;

        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Введите коэф. a : ");
        a3 = scanner.nextDouble();
        System.out.print("Введите коэф. b : ");
        b3 = scanner.nextDouble();
        System.out.print("Введите коэф. c : ");
        c3 = scanner.nextDouble();

        D = (b3 * b3) + 4 * a3 * c3;
        System.out.println("Дескриминант D равен = " + D);

        // ЕСЛИ : D > 0 ТО: есть два корня
        // ИНАЧЕ ЕСЛИ : D == 0 ТО: есть один корень
        // ИНАЧЕ: D < 0 ТО: корней нет

        // ЕСЛИ : D > 0
        if (D > 0) {
            // ТО: есть два корня
            x1 = (-b3 + Math.sqrt(D)) / (2 * a);
            x2 = (-b3 - Math.sqrt(D)) / (2 * a);
            System.out.println("Есть два корня. D = " + D);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        // ИНАЧЕ ЕСЛИ : D == 0
        else if (D == 0) {
            // ТО: есть один корень
            x1 = -b3 / (2 * a);
            x2 = x1;
            System.out.println("Есть один корень. D = " + D);
            System.out.println("x = " + x1);
        }
        // ИНАЧЕ:
        else {
            // ТО: корней нет
            System.out.println("Корней нет! D = " + D);
        }
    }
}
