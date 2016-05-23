package com.gmail.rollerxander.first.date23052016;

/**
 * Created by USER on 23.05.2016.
 */
public class App {

    public static void main(String... args) {
        String s = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50_000; i++) {
            s += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        if (s != null) {

        }
    }
}
