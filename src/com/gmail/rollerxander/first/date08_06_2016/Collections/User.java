package com.gmail.rollerxander.first.date08_06_2016.Collections;

/**
 * Created by Java on 08.06.2016.
 */
public class User implements Comparable<User>{
   private  String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.getName());
    }
}
