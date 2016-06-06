package com.gmail.rollerxander.first.date06_06_2016;

import com.gmail.rollerxander.first.date23052016.Gender;

/**
 * Created by USER on 23.05.2016.
 */
public class User {
    private int vozrast;

    private String login;
    private String password;
    private String email;

    private String firstName;
    private String lastName;
    private Gender gender;

    @Override
    public String toString() {
        return "User{" +
                "vozrast=" + vozrast +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public User(int vozrast, String firstName) {
        this.firstName = firstName;
        this.vozrast = vozrast;
    }

    public User(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    // overloading перегрузка конструктора


}
