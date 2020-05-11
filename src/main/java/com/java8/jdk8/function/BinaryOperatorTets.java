package com.java8.jdk8.function;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author chenbo
 * @date 2020/5/10 15:11
 */
public class BinaryOperatorTets {

    public static void main(String[] args) {
        BinaryOperatorTets binaryOperatorTets = new BinaryOperatorTets();
        System.out.println(binaryOperatorTets.compute(1, 2, (a, b) -> a + b));
        System.out.println("----------------返回字符串中比较短的那个------------");
        System.out.println(binaryOperatorTets.getShort("hello", "world", (a, b) -> a.length() - b.length()));
        System.out.println(binaryOperatorTets.getShort("hello", "world", (a, b) -> a.charAt(0) - b.charAt(0)));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
