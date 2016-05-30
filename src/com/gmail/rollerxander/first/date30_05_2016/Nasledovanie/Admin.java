package com.gmail.rollerxander.first.date30_05_2016.Nasledovanie;

/**
 * Created by USER on 30.05.2016.
 */
public class Admin extends Man {
    private String password;
private int i;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName + "-admin");
    }

    public static void print() {
        System.out.println("ADMIN");
    }
    public void setI(int i) {
        this.i = i;
    }
}
