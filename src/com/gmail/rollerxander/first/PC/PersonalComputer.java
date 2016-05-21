package com.gmail.rollerxander.first.PC;

/*
 * создать Пк и параметры вывести тустринг + тетрадка
 */
public class PersonalComputer {


    private String name;
    private Monitor monitor;
    private Cpu cpu;
    private Hdd hdd;
    private Ram ram;

    public PersonalComputer(String name, Monitor monitor, Cpu cpu, Hdd hdd, Ram ram) {
        this.name = name;
        this.monitor = monitor;
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void PcTotalInfo() {
        System.out.println("Total Info:");
        monitor.monitorInfo();
        cpu.cpuInfo();
        hdd.hddInfo();
        ram.ramInfo();
    }

    @Override
    public String toString() {
        return "PersonalComputer\n{" +
                "name='" + name + '\'' +
                ",\nmonitor=" + monitor +
                ",\ncpu=" + cpu +
                ",\nhdd=" + hdd +
                ",\nram=" + ram +
                '}';
    }


    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }


}
