package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 05.06.2016.
 */
public class Manager extends Man {

    private Automobile[] baza;

    public Automobile[] getBaza() {
        return baza;
    }

    public void setBaza(Automobile[] baza) {
        this.baza = baza;
    }

    public Manager(String sureName, String firstName, String secondName) {
        super(sureName, firstName, secondName);
    }


    public void maxDis(int i){
        baza[i].getMaxDistance();
    }
}
