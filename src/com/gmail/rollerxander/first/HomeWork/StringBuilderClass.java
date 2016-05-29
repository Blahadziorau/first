package com.gmail.rollerxander.first.HomeWork;

/**
 * Created by Rollershop on 29.05.2016.
 */
public class StringBuilderClass {
    public static void main(String... args){
        StringBuilder sb=new StringBuilder("User\n");
        System.out.println(sb.append("Blahadziorau\n").append("Aliaksandr\n").append('A'+"\n").append(133));
    }
}
