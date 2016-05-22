package com.gmail.rollerxander.first.PC;

/**
 * Created by Rollershop on 21.05.2016.
 */
public class Monitor {

    String brandMonitor;
    private int x;
    private int y;

    public Monitor(String brandMonitor, int x, int y) {
        this.brandMonitor = brandMonitor;
        this.x = x;
        this.y = y;
    }

    public void monitorInfo() {
        System.out.println(getBrandMonitor() + ", resolution " + getX() + "x" + getY());
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "brandMonitor='" + brandMonitor + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String getBrandMonitor() {
        return brandMonitor;
    }

    public void setBrandMonitor(String brandMonitor) {
        this.brandMonitor = brandMonitor;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
