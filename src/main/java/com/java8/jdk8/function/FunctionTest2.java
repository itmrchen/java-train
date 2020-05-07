package com.java8.jdk8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function compose、andThen用法
 *
 * @author chenbo
 * @date 2020/5/8 1:20
 */
public class FunctionTest2 {
    public static void main(String[] args) {
        FunctionTest2 functionTest2 = new FunctionTest2();
        System.out.println(functionTest2.compute1(2, value -> value * value, value -> value * 2));
        System.out.println(functionTest2.compute2(2, value -> value * value, value -> value * 2));
        System.out.println(functionTest2.compute3(1, 2, (v1, v2) -> v1 + v2));
        System.out.println(functionTest2.compute4(1, 2, (v1, v2) -> v1 + v2, v1 -> v1 * v1));
    }

    /**
     * a先作用于function2,结果作用域function1
     *
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compute1(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    /**
     * a先作用于function1,结果作用域function2
     *
     * @param a
     * @param function1
     * @param function2
     * @return
     */
    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    /**
     * 两个数的加减乘除运算
     *
     * @param a
     * @param b
     * @param bifunction
     * @return
     */
    public int compute3(int a, int b, BiFunction<Integer, Integer, Integer> bifunction) {
        return bifunction.apply(a, b);
    }

    /**
     * a,b 作用于bifunction，结果作用于function
     *
     * @param a
     * @param b
     * @param bifunction
     * @param function
     * @return
     */
    public int compute4(int a, int b, BiFunction<Integer, Integer, Integer> bifunction, Function<Integer, Integer> function) {
        return bifunction.andThen(function).apply(a, b);
    }

}
