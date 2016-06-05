package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 02.06.2016.
 */
public class AppMain {
    public static void main(String... args) {
        int count = 10;

        Automobile[] baza = new Automobile[count];

        Manager manager1 = new Manager("Ivanov", "Ivan", "Ivanovich"); // диспетчер

        manager1.setBaza(baza); // привязываем базу к диспетчеру

        Driver driver1 = new Driver("Lom", "Petr", "Petrovich"); // водитель

        Truck truck1 = new Truck(5000, 221000, 100, 25, 5000, driver1); // грузовик

        baza[0] = truck1; // вносим грузовик в базу

        // возможность просмотреть макс пробег без деспетчера, если база  не привязан а к деспетчеру
        // baza[0].getMaxDistance();

        manager1.maxDis(0); //возможность просмотреть пробег через деспетчера

    }
}
