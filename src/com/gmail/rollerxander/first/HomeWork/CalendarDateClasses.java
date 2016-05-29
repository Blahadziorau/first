package com.gmail.rollerxander.first.HomeWork;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rollershop on 29.05.2016.
 */
public class CalendarDateClasses {
    public static void main(String... args) {
        // Date date= new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.YYYY HH.mm.ss");
        System.out.println("Сегодня: " + format.format(new Date()));
    }
}
