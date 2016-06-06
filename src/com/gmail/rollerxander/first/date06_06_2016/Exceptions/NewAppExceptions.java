package com.gmail.rollerxander.first.date06_06_2016.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Java on 06.06.2016.
 */
public class NewAppExceptions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       try {
           int i = scanner.nextInt();
           System.out.println(i);
       }catch (InputMismatchException exception){
           System.out.println(exception);
       }finally {
           System.out.println("finally");
           scanner.close();
       }
        System.out.println("END");
    }
}
