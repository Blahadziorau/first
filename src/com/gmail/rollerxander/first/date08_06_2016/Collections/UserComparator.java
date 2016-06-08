package com.gmail.rollerxander.first.date08_06_2016.Collections;

import java.util.Comparator;

/**
 * Created by Java on 08.06.2016.
 */
public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
