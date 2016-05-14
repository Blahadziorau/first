package com.gmail.rollerxander.first;

/*программа, вычисляющая факториал натурального числа n, которое пользователь введёт с клавиатуры.  */

import java.util.Scanner;

public class FactorialByScanner {
    public static void main(String... args) {
        int n;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введи натуральное число ");
            n = scan.nextInt();
            int result = 1;
            for (int i = 2; i <= n; i++)
                result *= i;
            System.out.println(result);
            if (n == 0 || n == 1)
                System.out.println(result);
            if (n < 0)
                System.out.println("Это отрицательный факториал!");
        } while (n < 0);
        {
            System.out.println("Конец");
        }
    }


}
