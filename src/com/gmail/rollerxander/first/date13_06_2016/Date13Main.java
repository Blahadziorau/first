package com.gmail.rollerxander.first.date13_06_2016;

import java.util.*;

/**
 * Created by Java on 13.06.2016.
 */
public class Date13Main {
    private static Map<String, Comparator> map = new HashMap<>();

    public static void main(String[] args) {

//        map.put("id", new IdUserComparator());
//         map.put("name", new NameUserComparator());
//
//        User[] users = new User[]{new User(2, "Sasha"), new User(5, "Dima"), new User(1, "Jason")};
//        String key = args[0];
//
//        Comparator<User> comparator = map.get(key);
//
//        Map<Integer, User> map = new HashMap<>();
//        map.put(1, new User(1, "Felix"));
//        map.put(2, new User(1, "Telix"));
//        map.put(3, new User(1, "Velix"));

//        Set<Integer> set = map.keySet();
//        for (Map.Entry<Integer, User> entry : map.entrySet()) {
//            System.out.println(entry.getValue());
//        }

//        Random random= new Random();
//        List<User> integers=new ArrayList<>();
//        for (int i = 0; i <100000 ; i++) {
//            integers.add(new User(random.nextInt(10000), "aaaaa"));
//        }
//        System.out.println(integers);
//        Collections.sort(integers,new IdUserComparator());
//        System.out.println(integers);
        int x = 10;
        int x1 = 100;
        int y = 10;
        int y1 = 100;

        TreeSet<Point> points = new TreeSet<>((p1, p2) -> p1.getX() - p2.getX());
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            points.add(new Point(random.nextInt(1000), random.nextInt(1000)));
        }
        TreeSet<Point> points1 = new TreeSet<>((p1, p2) -> p1.getY() - p2.getY());
        points.subSet(new Point(x, 10), new Point(x1, 10));

        Set<Point> points2 = points1.subSet(new Point(1, y), new Point(1, y1));
        System.out.println(points2);
    }

}
