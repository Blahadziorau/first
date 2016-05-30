package com.gmail.rollerxander.first.date30_05_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by USER on 30.05.2016.
 */
public class App30may {
    public static void main(String... args) {

        Student s1 = new Student(1, "Ivanov", "Ivan", "Ivanovich", new Date(31, 10, 2000), 1, 25);
        Student s2 = new Student(2, "Petrov", "Petia", "Petrovich", new Date(16, 03, 2005), 5, 4);
        Student s3 = new Student(3, "Sidorov", "Sidor", "Sidorovich", new Date(01, 10, 2007), 3, 4);
        Student s4 = new Student(4, "Krasnow", "Kras", "Krasovich", new Date(21, 06, 2001), 2, 4);
        Student s5 = new Student(5, "Cyp", "Cypa", "Cypovna", new Date(02, 11, 2000), 4, 25);

        Student[] students = {s1, s2, s3, s4, s5};
        StudentFilter studentFilter = new StudentFilter(students);

        System.out.println("Сортировкка по имени");
        studentFilter.printByName("Ivan");

        System.out.println("Сортировкка по дате после");
        studentFilter.printYangest(new Date(01, 10, 2007));

        System.out.println("Сортировкка по группе");
        studentFilter.listGroup(25);

    }
}
