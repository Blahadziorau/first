package com.gmail.rollerxander.first.HomeWork;

import java.util.Random;

/**
 * Created by Rollershop on 17.05.2016.
 */
public class Mass_99_99 {
    public static void main(String... args) {

        int[][] mas = new int[5][8];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print((mas[i][j] = random.nextInt(100) + 10) + "; ");

            }
            System.out.println();

        }
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (max < mas[i][j])
                    max = mas[i][j];
            }
        }

        System.out.println(max);

    }
}
