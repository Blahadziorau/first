package com.gmail.rollerxander.first.HomeWork;

import java.util.Scanner;

/**
 * Created by Rollershop on 29.05.2016.
 */
public class Roliki {
    private String brand;
    private String model;
    private double razmer;
    private int diametrKoles;
    private int godVypuska;

    public Roliki(String brand, String model, double razmer, int diametrKoles, int godVypuska) {
        this.brand = brand;
        this.model = model;
        this.razmer = razmer;
        this.diametrKoles = diametrKoles;
        this.godVypuska = godVypuska;
    }


    @Override
    public String toString() {
        return "Roliki " +
                " Производитель " + brand +
                ", модель " + model +
                ", размер " + razmer +
                ", диаметр колес " + diametrKoles +
                ", год выпуска " + godVypuska
                ;
    }
}
