package com.gmail.rollerxander.first.date06_06_2016.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Java on 06.06.2016.
 */
public class NewAppExceptions {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(new File("C:\\Users\\Java.Rollershopby-ПК\\Desktop\\12.txt")));

            String i = scanner.nextLine();
            System.out.println(i);
        } catch (NoSuchElementException exception) {
            System.out.println(exception);
        } catch (FileNotFoundException ex) {
            System.out.println("no file");
        } finally {

            System.out.println("finally");
            if (scanner != null) {

            }
        }
        System.out.println("END");
    }
}
