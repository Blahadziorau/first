package com.gmail.rollerxander.first;

/*программа, выводящая на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/

public class First55 {
    public static void main(String... args){
    int count55=1;
        for (int i=0; ;i++){
            if(i%2!=0){
                System.out.println(i);
                count55++;
            }else if (count55==56){
                break;
            }


        }

    }
}
