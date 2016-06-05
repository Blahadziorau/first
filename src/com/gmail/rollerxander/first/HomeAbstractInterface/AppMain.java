package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 02.06.2016.
 */
public class AppMain {
    public static void main(String... args){

        Man driver1=new Driver("Loh", "Ivan", "Ivanovich");
        Man manager1=new Manager("Loh", "Ivan", "Ivanovich");
        System.out.println(manager1.getSureName());
        System.out.println(manager1.toString());
    }
}
