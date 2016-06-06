package com.gmail.rollerxander.first.date06_06_2016;

/**
 * Created by Java on 06.06.2016.
 */
public class CompareUserByAge implements CompareUser {


    public int compare(User user1, User user2) {
        return user1.getVozrast()-user2.getVozrast();
    }
}
