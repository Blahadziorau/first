package com.gmail.rollerxander.first.date08_06_2016;
/**
 * Created by Java on 08.06.2016.
 */
// класс хранилище данных
public class CacheInt {
    private  int[] mass;

    public CacheInt(int[] mass) {
        this.mass = mass;
    }

    public int[] getMass() {
        return mass;
    }
    public int getById(int i){
        return mass[i];
    }
}
