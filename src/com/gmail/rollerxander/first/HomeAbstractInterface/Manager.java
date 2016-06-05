package com.gmail.rollerxander.first.HomeAbstractInterface;

import java.util.Arrays;

/**
 * Created by Java on 05.06.2016.
 */
public class Manager extends Man {

    private int[] baza;

    public int[] getBaza() {
        return baza;
    }

    public void setBaza(int[] baza) {
        this.baza = baza;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "baza=" + Arrays.toString(baza) +
                '}';
    }

    public Manager(String sureName, String firstName, String secondName) {
        super(sureName, firstName, secondName);
    }
}
