package com.itog2.idea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввод:");
        String equation = reader.readLine();
        System.out.println("Вывод:");
        int a = Character.digit(equation.charAt(0), 10);
        char plusMinus = equation.charAt(1);
        int b = Character.digit(equation.charAt(2), 10);
        int c = Character.digit(equation.charAt(4), 10);
        if (a > -1 && b > -1) {
            if (plusMinus == '+') {
                System.out.println(a + b);
            } else {
                System.out.println(a - b);
            }
        } else if (a > -1) {
            if (plusMinus == '+') {
                System.out.println(c - a);
            } else {
                System.out.println(c * -1 + a);
            }
        } else if (plusMinus == '+') {
            System.out.println(c - b);
        } else {
            System.out.println(c + b);
        }

    }
}
