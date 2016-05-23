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
    private Gender gender;

    public User(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "gender=" + gender +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
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
