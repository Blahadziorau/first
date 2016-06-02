package com.gmail.rollerxander.first.date25_05_2016;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by USER on 25.05.2016.
 */
public class App {

    private static final int COUNT = 10;


    public static void main(String... args) {

        int[] mass = generateMass(10000, 20);
        System.out.println(Arrays.toString(mass));
        long start = System.currentTimeMillis();
        sort(mass);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static int[] generateMass(int count, int s) {
        int[] mass = new int[count];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(s);
        }

        return mass;
    }

    private static int[] generateMass(int count) {
        return generateMass(count, Integer.MAX_VALUE);
    }

    private static int[] generateMass() {
        return generateMass(COUNT);
    }

    private static void sort(int[] mass) {

        for (int j = 0; j < mass.length; j++) {

            for (int i = 0; i < mass.length - 1; i++) {
                int a = mass[i];
                int b = mass[i + 1];
                if (a > b) {
                    mass[i] = b;
                    mass[i + 1] = a;
                }
            }
            System.out.println(Arrays.toString(mass));
        }
    }
}
