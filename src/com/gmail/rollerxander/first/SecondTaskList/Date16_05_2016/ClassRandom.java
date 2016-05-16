package com.gmail.rollerxander.first.SecondTaskList.Date16_05_2016;

import java.util.Random;

/**
 * Created by USER on 16.05.2016.
 */
public class ClassRandom {
    public static void main(String... args){
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(random.nextInt(5)+"; ");

        }
    }
}
