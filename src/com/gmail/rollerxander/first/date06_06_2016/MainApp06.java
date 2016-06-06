package com.gmail.rollerxander.first.date06_06_2016;

import java.util.Arrays;

/**
 * Created by Java on 06.06.2016.
 */
public class MainApp06 {
    public static void main(String[] args) {
    User[] users={new User(10, "Sasha"),new User(20, "Petia"),new User(13, "Dima")};

        System.out.println(Arrays.asList(users));

        CompareUser compareUser=new CompareUserByAge();

        sort(users,compareUser);

        System.out.println(Arrays.asList(users));
    }
    private static void sort(User[] users, CompareUser compareUser){
        for (int i = 0; i <users.length ; i++) {

            for (int j = 0; j <users.length-1 ; j++) {
                User a=users[j];
                User b=users[j+1];
                if (compareUser.compare(a,b)<0){
                    users[j]=b;
                    users[j+1]=a;
                }
            }
        }
    }

}
