package com.gmail.rollerxander.first;

/*программа, выводящая на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 …*/

public class Third {
    public static void main(String... args) {
        for (int i = 90; i > 0; i -= 5) {
            System.out.println(i);
            if (i == 0) {
                break;
            }
        }
    }
}
