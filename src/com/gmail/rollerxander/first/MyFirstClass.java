package com.gmail.rollerxander.first;

import java.util.Scanner;

public class MyFirstClass {

    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введи число");
            number = scanner.nextInt();

            switch (number) {
                case 3:
                case 4:
                case 5:
                    System.out.println("Vesna");
                    break;
                case 1:
                case 2:
                case 12:
                    System.out.println("Zima");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Leto");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Leto");
                    break;
                default:
                    System.out.println("Введи от 1 do 12");
            }
        } while (number >= 1 && number <= 12);


    }
}
