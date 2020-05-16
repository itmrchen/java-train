package com.java8.jdk8.defaultmethod;

/**
 * @author chenbo
 * @date 2020/5/12 20:50
 */
public interface MyInterface1 {

    default void hello() {
        System.out.println("MyInterface1");
    }
}
