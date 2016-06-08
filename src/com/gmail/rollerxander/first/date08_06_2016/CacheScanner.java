package com.gmail.rollerxander.first.date08_06_2016;

import java.util.Scanner;

/**
 * Created by Java on 08.06.2016.
 */
public class CacheScanner {
    private Scanner[] mass;

    public CacheScanner(Scanner[] mass) {
        this.mass = mass;
    }

    public Scanner[] getMass() {
        return mass;
    }
    public Scanner getById(int i){
        return mass[i];
    }
}
