package com.java8.jdk8.function;

import java.util.function.Predicate;

/**
 * @author chenbo
 * @date 2020/5/9 20:36
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello1"));
    }
}
