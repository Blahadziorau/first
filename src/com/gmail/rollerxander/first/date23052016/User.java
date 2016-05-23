package com.gmail.rollerxander.first.date23052016;

/**
 * Created by USER on 23.05.2016.
 */
public class User {

    private String login;
    private String password;
    private String email;

    private String firstName;
    private String lastName;
    private String gender;
        // overloading перегрузка конструктора
    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User(String login, String password, String email, String firstName, String lastName) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String login, String password, String email, String firstName, String lastName, String gender) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
