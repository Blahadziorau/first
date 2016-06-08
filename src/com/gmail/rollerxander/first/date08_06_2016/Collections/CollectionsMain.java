package com.gmail.rollerxander.first.date08_06_2016.Collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Java on 08.06.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {
    /*    List<String> stringList = new ArrayList<>(1000000);
        stringList.add("a");
        stringList.add("love");
        stringList.add("c");
        List<String> strings = new ArrayList<>();
        strings.addAll(stringList);
        stringList.add(0, "22222");

    for(String s: stringList){
        System.out.println(s);
    }*/
        Set<User> set = new TreeSet<>((o1,o2)->o1.getName().compareTo(o2.getName()));
        for (int i = 0; i < 100; i++) {
            set.add(new User(""+i));
        }
        long s = System.currentTimeMillis();
        boolean i = set.contains(new User("1"));
        long e = System.currentTimeMillis();
        System.out.println(i);
        System.out.println(e-s);


    }
}
