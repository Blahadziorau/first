package com.gmail.rollerxander.first.SecondTaskList.Date16_05_2016;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by USER on 16.05.2016.
 */
public class Massive {
    public static void main(String... args) {
        int[] mass = new int[]{1, 4, 5, 6, 0, 12, 65, 78, 987};

        int[] mass1 = mass;
        mass1[0] = 1000;
        System.out.println(mass[0]);
        System.out.println(mass[1]);
    }
}
