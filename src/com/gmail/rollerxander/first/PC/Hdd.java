package com.gmail.rollerxander.first.PC;

/**
 * Created by Rollershop on 21.05.2016.
 */
public class Hdd {
    String brandHdd;
    private int volume;

    public Hdd(String brandHdd, int volume) {
        this.brandHdd = brandHdd;
        this.volume = volume;
    }

    public void hddInfo() {
        System.out.println(getBrandHdd() + " " + getVolume());
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "brandHdd='" + brandHdd + '\'' +
                ", volume=" + volume +
                '}';
    }

    public String getBrandHdd() {
        return brandHdd;
    }


    public int getVolume() {
        return volume;
    }


}
