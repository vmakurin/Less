package com.metadevs.Lesson1;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        //Вывод в консоль.
        System.out.println("Hi humans:(");
        int value1 = 2;
        int value2 = 8;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);
        int multiply = value1 * value2;
        System.out.println("Произведение " + multiply);
        int difference = value1 - value2;
        System.out.println("Разномть " + difference);
        Scanner scanner = new Scanner(System.in);
        //String userInput=scanner.next();
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
    }
}
