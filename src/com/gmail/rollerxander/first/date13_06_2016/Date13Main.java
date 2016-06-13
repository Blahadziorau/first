package com.gmail.rollerxander.first.date13_06_2016;

import com.gmail.rollerxander.first.date06_06_2016.CompareUserByName;
import com.gmail.rollerxander.first.date08_06_2016.Collections.User;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Java on 13.06.2016.
 */
public class Date13Main {
    private static Map<String, Comparator> map = new HashMap<>();

    public static void main(String[] args) {

        map.put("id", new IdUserComparator());
        map.put("name", new NameUserComparator());

        User[] users=new User[]{new User(2,"Sasha"), new User(5,"Dima"), new User(1,"Jason")};
        String key=args[0];

        Comparator<User> comparator=map.get(key);

        Map<Integer, User> map= new HashMap<>();
        map.put(1, new User(1,"Felix"));
        map.put(2, new User(1,"Telix"));
        map.put(3, new User(1,"Velix"));

        Set<Integer> set = map.keySet();

        for (Map.Entry<Integer,User>entry: map.entrySet()){
            System.out.println(entry.getValue());
        }

    }

}
