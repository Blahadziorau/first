package com.gmail.rollerxander.first.date08_06_2016;

import java.util.Scanner;

/**
 * Created by Java on 08.06.2016.
 */
public class GenericMain {
    public static void main(String[] args) {
        String[] strings = new String[20];
        CacheGeneric<String> generic = new CacheGeneric<String>(strings);
        String[] strings1 = generic.getMass();
        System.out.println(strings1);

        Scanner[] i= new Scanner[20];
        CacheGeneric<Scanner> scannerCacheGeneric= new CacheGeneric<>(i);
        Scanner scanner = scannerCacheGeneric.getById(2);
       // scannerCacheGeneric.printMass();
        System.out.println(scanner);
    }
}
