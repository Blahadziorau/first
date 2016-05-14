package com.gmail.rollerxander.first.SecondTaskList;

import java.util.Scanner;

/* Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
*Если пользователь введёт не целое число, то сообщать ему об ошибке.
* */
public class ChetNechet {
    public static void main(String... args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int chislo = sc.nextInt();
            if (chislo == 0) {
                System.out.println("Вы ввели ноль");

            } else if (chislo % 2 == 0) {
                System.out.println("Вы ввели четное число");
            } else {
                System.out.println("Вы ввели нечетное число");
            }

        } else {
            System.out.println("вы ввели не целое число");
        }
    }

}
