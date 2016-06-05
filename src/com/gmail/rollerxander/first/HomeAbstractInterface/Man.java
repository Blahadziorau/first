package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 04.06.2016.
 */
public abstract class Man {
    private static String sureName;
    private static String firstName;
    private static String secondName;

    public static String getSureName() {
        return sureName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getSecondName() {
        return secondName;
    }

    public Man(String sureName, String firstName, String secondName) {
        this.sureName=sureName;
        this.firstName=firstName;
        this.secondName=secondName;

    }
}
