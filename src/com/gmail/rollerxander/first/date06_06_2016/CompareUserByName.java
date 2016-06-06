package com.gmail.rollerxander.first.date06_06_2016;

/**
 * Created by Java on 06.06.2016.
 */
public class CompareUserByName implements CompareUser {
    public int compare(User user1, User user2) {
      return user2.getFirstName().compareToIgnoreCase(user1.getFirstName());
    }
}
