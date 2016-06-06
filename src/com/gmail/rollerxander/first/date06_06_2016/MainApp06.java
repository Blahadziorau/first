package com.gmail.rollerxander.first.date06_06_2016;

import java.util.Arrays;

/**
 * Created by Java on 06.06.2016.
 */
public class MainApp06 {
    public static void main(String[] args) {
        User[] users = {new User(10, "Sasha"), new User(20, "Petia"), new User(13, "Dima")};

        System.out.println(Arrays.asList(users));

        CompareUser compareUser = new CompareUserByAge();


        //sort(users,compareUser);
        //System.out.println(Arrays.asList(users));

       /* sort(users, new CompareUser() {
            public int compare(User user1, User user2) {
                return user1.getVozrast() - user2.getVozrast();
            }
        });
        */

       // sort(users, (a,b)->{return a.getVozrast()-b.getVozrast(); });//лямбды
       // sort(users, (a,b)->{return a.getFirstName().compareToIgnoreCase(a.getFirstName()); });//лямбды


       /* ShowUsers(users,user -> System.out.println(user.getFirstName())); //через лямбда

       //через анонимный класс
        ShowUsers(users, new Printer() {
            @Override
            public void print(User user) {
                System.out.println(user.getFirstName());

            }
        });
        */
    }
    public static void ShowUsers(User[] users, Printer printer) {
        for (User u : users) {
            printer.print(u);

        }
    }


    private static void sort(User[] users, CompareUser compareUser) {
        for (int i = 0; i < users.length; i++) {

            for (int j = 0; j < users.length - 1; j++) {
                User a = users[j];
                User b = users[j + 1];
                if (compareUser.compare(a, b) < 0) {
                    users[j] = b;
                    users[j + 1] = a;
                }
            }
        }
    }

}
