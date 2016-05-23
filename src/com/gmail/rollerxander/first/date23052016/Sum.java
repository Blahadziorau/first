package com.gmail.rollerxander.first.date23052016;

/**
 * Created by USER on 23.05.2016.
 */
public class Sum {
    private Sum(){
    }

    public static int math(int... a){
        int math=0;
        for (int i:a) {
            math+=i;
        }
        return math;
    }
  /*  public static int Sum(int a, int b){

        return a+b;
    }
    public static int Sum(int a, int b, int c){

        return a+b+c;
    }
    public static int Sum(int a, int b, int c, int d){

        return a+b+c+d;
    }
    */

}
