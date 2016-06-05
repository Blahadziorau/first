package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 05.06.2016.
 */
public class Manager extends Man {

    private Truck[] baza;

    public Truck[] getBaza() {
        return baza;
    }

    public void setBaza(Truck[] baza) {
        this.baza = baza;
    }

    public Manager(String sureName, String firstName, String secondName) {
        super(sureName, firstName, secondName);
    }


}
