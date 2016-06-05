package com.gmail.rollerxander.first.HomeAbstractInterface;

/**
 * Created by Java on 02.06.2016.
 */
public class AppMain {
    public static void main(String... args){
        int count=10;
        int[] baza=new int[count];
        Man driver1=new Driver("Loh", "Ivan", "Ivanovich");
       Manager manager1=new Manager("Loh", "Ivan", "Ivanovich");
        manager1.setBaza(baza);
        System.out.println(manager1.getSureName());
        System.out.println(manager1.toString());
        manager1.setBaza(null);
        System.out.println(manager1.toString()+manager1.toString());
        Truck truck=new Truck(9000);
        
    }
}
