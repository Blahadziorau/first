package com.gmail.rollerxander.first.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Rollershop on 29.05.2016.
 */
public class BazaRolikov {

    private String name;

    public BazaRolikov(String name) {
        this.name = name;
    }

    public static String para() {
        String brand, model;
        double razmer;
        int diametrKoles, godVypuska;

        Scanner sc = new Scanner(System.in);

        System.out.println("введи Бренд");
        brand = sc.nextLine();
        System.out.println("введи модель");
        model = sc.nextLine();
        System.out.println("введи размер");
        razmer = sc.nextDouble();
        System.out.println("введи диаметр колес");
        diametrKoles = sc.nextInt();
        System.out.println("введи год выпуска");
        godVypuska = sc.nextInt();

        Roliki para = new Roliki(brand, model, razmer, diametrKoles, godVypuska);
        return para.toString();
        //String[] mass= new String[10];
        //System.out.println(mass[1].toString());

    }

}
