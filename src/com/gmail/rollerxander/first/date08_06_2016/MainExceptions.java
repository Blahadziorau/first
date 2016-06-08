package com.gmail.rollerxander.first.date08_06_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Java on 08.06.2016.
 */
public class MainExceptions {
    public static void main(String[] args) {



    }

    private static String getString() throws FileNotFoundException {
        Scanner scanner = null;
        String i;

        try {
            scanner = new Scanner(new FileReader(new File("C:\\Users\\Java.Rollershopby-ПК\\Desktop\\12.txt")));

            i = scanner.nextLine();

        } catch (FileNotFoundException ex) {
            throw new MyExceptionUnchecked();
        }

        System.out.println("finally");
        if (scanner != null) {

        }

        System.out.println("END");
        return null;

    }
}