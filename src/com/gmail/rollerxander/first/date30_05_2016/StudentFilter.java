package com.gmail.rollerxander.first.date30_05_2016;

import java.util.Date;

/**
 * Created by USER on 30.05.2016.
 */
public class StudentFilter {
    private final Student[] students;

    StudentFilter(Student[] students) {
        this.students = students;
    }

    void printByName(String name) {
        for (Student s : students) {
            if (s.getFirstName().equals(name)) {
                System.out.println(s);
            }
        }
    }

    void printYangest(Date date) {
        for (Student s : students) {
            if (s.getBirthDate().after(date)) {
                System.out.println(s);
            }
        }
    }

    void listGroup(int group) {
        for (Student s : students) {
            if (s.getGroup() == group) {
                System.out.println(s);
            }
        }
    }
}
