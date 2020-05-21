package com.java8.jdk8.stream2;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author chenbo
 * @date 2020/5/22 1:46
 */
public class CloseableTest implements Closeable {

    public void test() {
        System.out.println("test invoked!");
    }

    @Override
    public void close() throws IOException {
        System.out.println("close invoked!");
    }

    public static void main(String[] args) throws IOException {
        try (CloseableTest closeableTest = new CloseableTest()) {
            closeableTest.test();
        }
    }
}
