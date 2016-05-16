package com.gmail.rollerxander.first.SecondTaskList.Date16_05_2016;

import java.util.Random;

/**
 * Created by USER on 16.05.2016.
 */
public class MassiveTask {
    public static void main(String... args) {

        int[][] mas = new int[8][5];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print((mas[i][j] = random.nextInt(90) + 10) + "; ");

            }
            System.out.println();

        }


    }
}
