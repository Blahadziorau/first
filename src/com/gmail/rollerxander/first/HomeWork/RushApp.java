package com.gmail.rollerxander.first.HomeWork;

import java.util.Scanner;

/**
 * Created by Rollershop on 28.05.2016.
 */
public class RushApp {

    // проверка года на високостность

    public static void main(String[] args) throws Exception {

        System.out.println("Ввведи год \n");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            int x = 366;
            System.out.println("количество дней в году: " + x);
        } else {
            int x = 365;
            System.out.println("количество дней в году: " + x);
        }
    }
}
