package com.gmail.rollerxander.first;

import java.util.Scanner;

/*   положительные делители натурального числа, введённого пользователем с клавиатуры.
 */
public class Deliteli {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введи натуральное число \n");
        while (sc.hasNextInt()) {
            int chislo = sc.nextInt();

            System.out.print("Делители числа "+chislo+": \n");

            for (int i = chislo; i > 0; i--) {

                if (chislo % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println("Это не натуральное число");

    }
}


