package com.gmail.rollerxander.first.HomeWork.Home11_06;

import java.util.Scanner;

/**
 * Created by Rollershop on 11.06.2016.
 */
public class Comp {
    private String name;
    private int ram;
    private int hdd;
    private double weight;

    public Comp(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
        System.out.println("Мое имя: " + name);
    }

    public Comp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи имя компа");
        if (sc.hasNextLine()) {
            name = sc.nextLine();
            System.out.println(name + " successfully added ");
        } else {
            System.out.println("Enter String Data");
        }


        if (sc.hasNextInt()) {
            ram = sc.nextInt();
            System.out.println(ram + "  successfully added");
        } else {
            System.out.println("Enter INT Data");
        }

        System.out.println("Введи hdd");
        if (sc.hasNextInt()) {
            hdd = sc.nextInt();
            System.out.println(hdd + "  successfully added");
        } else {
            System.out.println("Enter INT Data");
        }

        System.out.println("Введи weight");
        if (sc.hasNextDouble()) {
            weight = sc.nextDouble();
            System.out.println(weight + "  successfully added");
        } else {
            System.out.println("Enter DOUBLE Data");
        }

        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Comp{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", weight=" + weight +
                '}';
    }
}
