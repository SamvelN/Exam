package com.aca;

import java.util.Scanner;

public class Main<k> {

    public static void main(String[] args) {

        //num_1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Внимание!!! Введите числа, для прерывания ввода чисел введите 0");
        int k = 1, sum = 0;
        for (int i = 0; i == 0; k++) {
            System.out.print("Пожалуйста, введите " + k + "-ое число ");
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("Сумма введённых Вами чисел = " + sum);*/

        //num_2
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово для проверки является ли оно анаграммой ");
        String word = sc.nextLine();
        System.out.println(anagramma(word));*/

        //num_3
        /*System.out.println(text1());
        float a = option();
        System.out.println(text2());
        int b = size();
        System.out.println(text3());
        int c = amount();
        System.out.println(a * b * c);*/
    }

    //num_2
    /*public static boolean anagramma(String word) {
        boolean result = true;
        for (int i = 0; i <= word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                result = false;
                break;
            }
        }
        if (result == true)
            return result;
        else
            return result;
    }*/

    //Num_3
    /*public static String text1() {
        return ("1) americano - 1$ \n2) latte - 3.6$ \n3) espresso - 0.5$ \n4) capuchino - 4.8$");
    }

    public static float option() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер варианта ");
        float num1 = sc.nextInt();
        if (num1 < 1 || num1 > 4)
            option();
        if (num1 == 1)
            num1 = 1;
        else if (num1 == 2)
            num1 = 3.6f;
        else if (num1 == 3)
            num1 = 0.5f;
        else
            num1 = 4.8f;
        return num1;
    }

    public static String text2() {
        return ("1) 50ml - x1 \n2) 100ml - x2");
    }


    public static int size() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер варианта ");
        int num2 = sc.nextInt();
        if (num2 < 1 || num2 > 2)
            option();
        return num2;
    }

    public static String text3() {
        return ("Сколько штук хотите покупать ");
    }

    public static int amount() {
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        return num3;
    }*/
}
