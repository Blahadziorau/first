package com.gmail.rollerxander.first.date13_06_2016;

import java.util.Comparator;

/**
 * Created by Java on 13.06.2016.
 */
public class SortUtl {
    private SortUtl(){

    }
    public static <T> void sort(T[] arr, Comparator<T> comparator){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (comparator.compare(arr[j], arr[j+1])>0){
                    T a=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                }
            }

        }

    }
}
