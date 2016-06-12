package com.gmail.rollerxander.first.HomeWork.Home12_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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

        mass.add(5, new Element("Jubi", 1988));
        // mass.remove(5);


        for (int el = 0; el < mass.size(); el++
                ) {
            //System.out.println(mass.get(el).getName()+" "+mass.get(el).getNumber());
            System.out.println(mass.get(el).toString());
        }
        System.out.println("Размер листа: " + mass.size());

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Sasha", 1982);
        map.put("Julia", 1988);
        System.out.println(map.get("Sasha"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println();
        Map<Integer, Element> mapElements = new HashMap<Integer, Element>();
        mapElements.put(1, new Element("Petia", 2000));
        mapElements.put(2, new Element("cat", 2001));
        System.out.println(mapElements.get(2));
    }

}
