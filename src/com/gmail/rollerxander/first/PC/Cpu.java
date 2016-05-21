package com.gmail.rollerxander.first.PC;

/**
 * Created by Rollershop on 21.05.2016.
 */
public class Cpu {
    String brandCpu;
    private int numOfCores;
    private double cpuFrequency;

    public Cpu(String brandCpu, int numOfCores, double cpuFrequency) {
        this.brandCpu = brandCpu;
        this.numOfCores = numOfCores;
        this.cpuFrequency = cpuFrequency;
    }

    public String getBrandCpu() {
        return brandCpu;
    }

    public void setBrandCpu(String brandCpu) {
        this.brandCpu = brandCpu;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public void cpuInfo() {
        System.out.println(getBrandCpu() + " " + getNumOfCores() + "x" + getCpuFrequency());
    }
}
