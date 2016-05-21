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

    public void cpuInfo() {
        System.out.println(getBrandCpu() + " " + getNumOfCores() + "x" + getCpuFrequency());
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "brandCpu='" + brandCpu + '\'' +
                ", numOfCores=" + numOfCores +
                ", cpuFrequency=" + cpuFrequency +
                '}';
    }

    public String getBrandCpu() {
        return brandCpu;
    }


    public int getNumOfCores() {
        return numOfCores;
    }


    public double getCpuFrequency() {
        return cpuFrequency;
    }


}
