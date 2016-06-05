package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 02.06.2016.
 */
public class AppMain {
    public static void main(String... args) {
        int count = 10;
        Truck[] baza = new Truck[count];
        Manager manager1 = new Manager("Ivanov", "Ivan", "Ivanovich");
        Driver driver1 = new Driver("Lom", "Petr", "Petrovich");
        Truck truck1 = new Truck(5000, 221000, 100, 25, 5000, driver1);
        baza[0] = truck1;
        baza[0].getMaxDistance();


    }
}
