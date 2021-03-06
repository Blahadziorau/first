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
        System.out.println("Total Info:\n" + name);
        monitor.monitorInfo();
        cpu.cpuInfo();
        hdd.hddInfo();
        ram.ramInfo();
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "name='" + name + '\'' +
                ", monitor=" + monitor +
                ", cpu=" + cpu +
                ", hdd=" + hdd +
                ", ram=" + ram +
                '}';
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }


}
