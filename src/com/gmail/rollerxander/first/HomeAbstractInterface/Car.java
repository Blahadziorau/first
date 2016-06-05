package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 02.06.2016.
 */
public class Car implements Automobile {


    private int speed;
    private int weight;
    private int usageFuel;
    private int distance;
    private Driver driver;
    private int numPlaces;

    public Car(int distance, int numPlaces, int speed, int usageFuel, int weight, Driver driver) {
        this.distance = distance;
        this.numPlaces = numPlaces;
        this.speed = speed;
        this.usageFuel = usageFuel;
        this.weight = weight;
        this.driver = driver;
    }

    public Car(int distance, int numPlaces, int speed, int usageFuel, int weight) {
        this.distance = distance;
        this.numPlaces = numPlaces;
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

    public int getDistance() {
        return distance;
    }

    public int getNumPlaces() {
        return numPlaces;
    }

    public int getSpeed() {
        return speed;
    }

    public int getUsageFuel() {
        return usageFuel;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void getMaxDistance() {
        System.out.println("Max probeg " + this.distance);

    }
}
