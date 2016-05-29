package com.gmail.rollerxander.first.HomeWork;

import java.util.Scanner;

/**
 * Created by Rollershop on 29.05.2016.
 */
public class BazaOfNames {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи имя базы\n");
        String bazaName = scanner.nextLine();
        System.out.println("Введите количество ячеек базы\n");
        byte count = scanner.nextByte();


        BazaRolikov bazaRolikov = new BazaRolikov(bazaName);

        String[] massBazy = new String[count];
        for (int i = 0; i < massBazy.length; i++) {
            massBazy[i] = bazaRolikov.para();
            System.out.println(massBazy[i].toString());
        }

        scanner.close();


    }
}
