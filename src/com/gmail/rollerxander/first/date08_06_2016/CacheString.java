package com.gmail.rollerxander.first.date08_06_2016;

/**
 * Created by Java on 08.06.2016.
 */
public class CacheString {
    private String[] mass;

    public CacheString(String[] mass) {
        this.mass = mass;
    }

    public String[] getMass() {
        return mass;
    }
    public String getById(int i){
        return mass[i];
    }
}
