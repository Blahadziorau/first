package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 02.06.2016.
 */
public class Truck implements Automobile {
    private int speed;
    private int weight;
    private int usageFuel;
    private int distance;
    private int capacityWeight;
    private Driver driver;

    public Truck(int capacityWeight, int distance, int speed, int usageFuel, int weight, Driver driver) {
        this.capacityWeight = capacityWeight;
        this.distance = distance;
        this.driver = driver;
        this.speed = speed;
        this.usageFuel = usageFuel;
        this.weight = weight;
    }

    public Truck(int capacityWeight, int distance, int speed, int usageFuel, int weight) {
        this.capacityWeight = capacityWeight;
        this.distance = distance;
        this.speed = speed;
        this.usageFuel = usageFuel;
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "capacityWeight=" + capacityWeight +
                ", speed=" + speed +
                ", weight=" + weight +
                ", usageFuel=" + usageFuel +
                ", distance=" + distance +
                ", driver=" + driver +
                '}';
    }


    @Override
    public void getMaxDistance() {
        System.out.println("Max probeg " + this.distance);

    }
}

