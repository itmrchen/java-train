package com.java8.jdk8.function;

import java.util.function.Function;

/**
 * @author chenbo
 * @date 2020/5/7 21:14
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();
        System.out.println(functionTest.compute(1, value -> {
            return value * 2;
        }));

        System.out.println(functionTest.compute(2, value -> value + 3));
        System.out.println(functionTest.convert(2, value -> value + "hello"));

    }

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
