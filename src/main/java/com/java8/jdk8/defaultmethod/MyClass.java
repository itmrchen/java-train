package com.java8.jdk8.defaultmethod;

/**
 * @author chenbo
 * @date 2020/5/12 20:51
 */
public class MyClass implements MyInterface1, MyInterface2 {
    @Override
    public void hello() {
        MyInterface2.super.hello();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.hello();
    }
}
