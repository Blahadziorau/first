package com.gmail.rollerxander.first.SecondTaskList;

import java.util.Scanner;

/*Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class SumOfTwoInt {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.println("Введи первое число");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            System.out.println("введи второе число");
            if (sc.hasNextInt()){

                y=sc.nextInt();
                sum(x, y);
            }else{
                System.out.println("введи целое число");
            }
        } else {
            System.out.println("введи целое число");
        }




    }

    private static void sum(int x, int y) {
        int sum = x + y;
        System.out.println("Сумма равна: " + sum);
    }
}
