package com.gmail.rollerxander.first.date13_06_2016;

import com.gmail.rollerxander.first.date08_06_2016.Collections.User;

import java.util.Comparator;

/**
 * Created by Java on 13.06.2016.
 */
public class IdUserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }
}
