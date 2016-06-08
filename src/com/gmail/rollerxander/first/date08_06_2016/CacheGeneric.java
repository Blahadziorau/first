package com.gmail.rollerxander.first.date08_06_2016;

/**
 * Created by Java on 08.06.2016.
 */
public class CacheGeneric<T> {
    private  T[] mass;

    public CacheGeneric(T[] mass) {
        this.mass = mass;
    }

    public T[] getMass() {
        return mass;
    }
    public T getById(int i){
        return mass[i];
    }
    public void printMass(){
        for (T i:mass) {
            System.out.println(i);

        }
    }
}
