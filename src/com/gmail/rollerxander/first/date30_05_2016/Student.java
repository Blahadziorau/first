package com.gmail.rollerxander.first.date30_05_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by USER on 30.05.2016.
 */
public class Student {
    private final static SimpleDateFormat FORMAT = new SimpleDateFormat("dd//MM//YYYY");
    private Student[] student;
    private int id;
    private String sureName;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private int kurs;
    private int group;


    public Student(int id, String sureName, String firstName, String secondName, Date birthDate, int kurs, int group) {
        this.id = id;
        this.sureName = sureName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.kurs = kurs;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sureName='" + sureName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDate=" + FORMAT.format(birthDate) +
                ", kurs=" + kurs +
                ", group=" + group +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
