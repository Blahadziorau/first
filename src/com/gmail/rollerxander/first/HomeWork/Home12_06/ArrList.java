package com.gmail.rollerxander.first.HomeWork.Home12_06;

import java.util.ArrayList;


/**
 * Created by Rollershop on 12.06.2016.
 */
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Element> mass = new ArrayList<Element>();
        for (int i = 0; i < 10; i++) {
            mass.add(new Element("Sasa", 1982));
        }
        System.out.println("Добавление прошло успешно!");

        mass.add(5, new Element("Jubi", 1985));
        // mass.remove(5);


        for (int el = 0; el < mass.size(); el++
                ) {
            //System.out.println(mass.get(el).getName()+" "+mass.get(el).getNumber());
            System.out.println(mass.get(el).toString());
        }
        System.out.println("Размер листа: "+mass.size());
    }
}
