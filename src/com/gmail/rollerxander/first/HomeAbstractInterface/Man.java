package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 04.06.2016.
 */
public abstract class Man {
    private String sureName;
    private String firstName;
    private String secondName;

    public Man(String sureName, String firstName, String secondName) {
        this.sureName = sureName;
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public String getSureName() {
        return sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "Man{" +
                "firstName='" + firstName + '\'' +
                ", sureName='" + sureName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
