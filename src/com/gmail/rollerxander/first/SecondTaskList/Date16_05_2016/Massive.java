package com.gmail.rollerxander.first.SecondTaskList.Date16_05_2016;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 16.05.2016.
 */
public class Massive {
    public static void main(String... args) {
        int[] mass = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < mass.length; i++) {

            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            mass[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(mass));

    }
}
