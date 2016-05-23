package com.gmail.rollerxander.first.date23052016;

/**
 * Created by USER on 23.05.2016.
 */
public class ImmutablePoint {
    final private int x;
    final private int y;


    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
