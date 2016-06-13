package com.gmail.rollerxander.first.date13_06_2016;

import java.io.IOException;

/**
 * Created by Java on 13.06.2016.
 */
public class MyClosable implements AutoCloseable {
    public MyClosable() {
        System.out.println("in");
    }

    public void excp() throws IOException {
        throw new IOException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("CLOSE");
    }
}
