package com.gmail.rollerxander.first.HomeWork.Home12_06;

/**
 * Created by Rollershop on 12.06.2016.
 */
public class Element {
    private String name;
    private int number;

    public Element(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}
