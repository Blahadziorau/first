package com.gmail.rollerxander.first.PC;

/**
 * Created by Rollershop on 21.05.2016.
 */
public class Ram {
    String brandRam;
    private int ramVolume;

    public Ram(String brandRam, int ramVolume) {
        this.brandRam = brandRam;
        this.ramVolume = ramVolume;
    }

    public String getBrandRam() {
        return brandRam;
    }

    public void setBrandRam(String brandRam) {
        this.brandRam = brandRam;
    }

    public int getRamVolume() {
        return ramVolume;
    }

    public void setRamVolume(int ramVolume) {
        this.ramVolume = ramVolume;
    }

    public void ramInfo() {
        System.out.println(getBrandRam() + " " + getRamVolume());
    }
}
